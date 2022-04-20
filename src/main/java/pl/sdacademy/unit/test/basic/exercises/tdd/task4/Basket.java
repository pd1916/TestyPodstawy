package pl.sdacademy.unit.test.basic.exercises.tdd.task4;

public class Basket {
    private int maxBooksInBasket;
    private Book[] books;
    private int currentNoOfBooksInBasket = 0;

    public Basket(int maxBooksInBasket) {
        this.maxBooksInBasket = maxBooksInBasket;
        books = new Book[maxBooksInBasket];
    }

    public Book[] getAllBooks() {
        return books;
    }

    public boolean addBook(Book book) {
        if (currentNoOfBooksInBasket >= maxBooksInBasket) {
            System.out.println("Max number of books in basket");
            return false;
        }
        books[currentNoOfBooksInBasket++] = book;
        return true;
    }

    public void cleanBasket() {
        for (int i = 0; i < currentNoOfBooksInBasket; i++) {
            books[i] = null;
        }
    }

    public float getTotalAmount() {
        float result = 0;
        for (int i = 0; i < currentNoOfBooksInBasket; i++) {
            result += books[i].getPrice();
        }
        return result;
    }
}