package pl.sdacademy.unit.test.basic.exercises.tdd.task4;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    private static Book book1;
    private static Book book2;
    private static Book book3;

    @Test
    void shouldRemoveAllAddedBooksFromBasket() {
        //given
        Basket basket = initData();
        //when
        basket.cleanBasket();
        Book[] result = basket.getAllBooks();
        //then
        Book[] expectedResult = {null, null, null};
        assertArrayEquals(expectedResult, result);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnTotalAmount() {
        //given
        Basket basket = initData();
        //when
        float result = basket.getTotalAmount();
        //then
        assertEquals(225, result);
        assertThat(result).isEqualTo(225);
    }

    @Test
    void shouldNotAddBookWhenBasketIsFull() {
        //given
        Basket basket = new Basket(2);
        Book book1 = new Book("abc", new Author("aaa", "bbb"), 50);
        Book book2 = new Book("cba", new Author("ccc", "ddd"), 75);
        basket.addBook(book1);
        basket.addBook(book2);
        //when
        Book book3 = new Book("qwerty", new Author("eee", "fff"), 100);
        boolean result = basket.addBook(book3);
        //
        assertFalse(result);
        assertThat(result).isFalse();
    }

    @Test
    void shouldAddBookWhenBasketIsNotFull() {
        //given
        Basket basket = new Basket(2);
        //when
        Book book1 = new Book("qwerty", new Author("eee", "fff"), 100);
        boolean result = basket.addBook(book1);
        //
        assertTrue(result);
        assertThat(result).isTrue();
    }

    private Basket initData() {
        Basket basket = new Basket(3);
        book1 = new Book("abc", new Author("aaa", "bbb"), 50);
        book2 = new Book("cba", new Author("ccc", "ddd"), 75);
        book3 = new Book("qwerty", new Author("eee", "fff"), 100);
        basket.addBook(book1);
        basket.addBook(book2);
        basket.addBook(book3);
        return basket;
    }
}