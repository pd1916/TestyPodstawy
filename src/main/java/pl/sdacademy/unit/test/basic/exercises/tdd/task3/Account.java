package pl.sdacademy.unit.test.basic.exercises.tdd.task3;

public class Account {
    private static final String ACCOUNT_NUMBER_REGEX = "\\d{26}";
    private float balance;
    private String accountNumber;
    private Customer customer;

    public Account(float balance, String accountNumber, Customer customer) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.customer = customer;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void transferMoney(Account account, float amount) {
        if(validate(account, amount)) {
            transfer(account, amount);
        }
    }

    private void transfer(Account account, float amount) {
        this.setBalance(this.getBalance() - amount);
        account.setBalance(account.getBalance() + amount);
    }

    private boolean validate(Account account, float amount) {
        return isValidAccountNumber(this.getAccountNumber())
                && isValidAccountNumber(account.getAccountNumber())
                && isValidAmount(amount);
    }

    private boolean isValidAmount(float amount) {
        if(amount > 0 && this.getBalance() >= amount) {
            return true;
        }
        System.out.println("Incorrect amount: " + amount);
        return false;
    }

    private boolean isValidAccountNumber(String accountNumber) {
        if(accountNumber.matches(ACCOUNT_NUMBER_REGEX)) {
            return true;
        }
        System.out.println("Wrong account number: " + accountNumber);
        return false;
    }
}