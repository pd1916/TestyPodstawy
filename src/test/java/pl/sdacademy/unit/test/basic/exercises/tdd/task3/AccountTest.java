package pl.sdacademy.unit.test.basic.exercises.tdd.task3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {
    private static final Customer CUSTOMER_1 = new Customer("Jan", "Kowalski");
    private static final Customer CUSTOMER_2 = new Customer("Ala", "Nowak");
    private static final String CORRECT_ACCOUNT_NUMBER_1 = "11111111111111111111111111";
    private static final String CORRECT_ACCOUNT_NUMBER_2 = "22222222222222222222222222";
    private static final String INCORRECT_ACCOUNT_NUMBER_1 = "111111111111111111111111111";
    private static final String INCORRECT_ACCOUNT_NUMBER_2 = "aaaaaaaaaaaaaaaaaaaaaaaaaa";

    /*
            given:
            credit: 1000, 11111111111111111111111111
            debit: 2000, 22222222222222222222222222
            when:
            przelew 100zł
            then:
            credit: 1100
            debit: 1900
             */
    @Test
    void shouldTransferCorrectAmount() {
        //given
        Account credit = new Account(1000, CORRECT_ACCOUNT_NUMBER_1, CUSTOMER_1);
        Account debit = new Account(2000, CORRECT_ACCOUNT_NUMBER_2, CUSTOMER_2);
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1100, credit.getBalance());
        assertEquals(1900, debit.getBalance());
    }

    /*
    given:
    credit: 1000, 111111111111111111111111111
    debit: 2000, 22222222222222222222222222
    when:
    przelew 100zł
    then:
    credit: 1000
    debit: 2000
     */
    @Test
    void shouldNotTransferAmountIfCreditAccountNumberIsWrong() {
        //given
        Account credit = new Account(1000, INCORRECT_ACCOUNT_NUMBER_1, CUSTOMER_1);
        Account debit = new Account(2000, CORRECT_ACCOUNT_NUMBER_2, CUSTOMER_2);
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(2000, debit.getBalance());
    }

    /*
    given:
    credit: 1000, 11111111111111111111111111
    debit: 2000, aaaaaaaaaaaaaaaaaaaaaaaaaa
    when:
    przelew 100zł
    then:
    credit: 1000
    debit: 2000
     */
    @Test
    void shouldNotTransferAmountIfDebitAccountNumberIsWrong() {
        //given
        Account credit = new Account(1000, CORRECT_ACCOUNT_NUMBER_1, CUSTOMER_1);
        Account debit = new Account(2000, INCORRECT_ACCOUNT_NUMBER_2, CUSTOMER_2);
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(2000, debit.getBalance());
    }

    /*
    given:
    credit: 1000, 11111111111111111111111111
    debit: 50, 22222222222222222222222222
    when:
    przelew 100zł
    then:
    credit: 1000
    debit: 50
     */
    @Test
    void shouldNotTransferAmountIfDebitBalanceIsLowerThanTransferMoney() {
        //given
        Account credit = new Account(1000, CORRECT_ACCOUNT_NUMBER_1, CUSTOMER_1);
        Account debit = new Account(50, CORRECT_ACCOUNT_NUMBER_2, CUSTOMER_2);
        //when
        debit.transferMoney(credit, 100);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(50, debit.getBalance());
    }

    @Test
    @DisplayName("Should not transfer money if transfer amount is equal to 0")
    void shouldNotTransferAmountIfTransferMoneyIsEqualZero() {
        //given
        Account credit = new Account(1000, CORRECT_ACCOUNT_NUMBER_1, CUSTOMER_1);
        Account debit = new Account(2000, CORRECT_ACCOUNT_NUMBER_2, CUSTOMER_2);
        //when
        debit.transferMoney(credit, 0);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(2000, debit.getBalance());
    }

    @Test
    void shouldNotTransferAmountIfTransferMoneyIsLessThanZero() {
        //given
        Account credit = new Account(1000, CORRECT_ACCOUNT_NUMBER_1, CUSTOMER_1);
        Account debit = new Account(2000, CORRECT_ACCOUNT_NUMBER_2, CUSTOMER_2);
        //when
        debit.transferMoney(credit, -100);
        //then
        assertEquals(1000, credit.getBalance());
        assertEquals(2000, debit.getBalance());
    }
}