import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class LibraryTest{

    Books books;
    @BeforeEach
    void setup(){
       Library library = new Library();
       Books book1 = new Books("BO1", "Percy Jackson", "The Lightning Thief", "July 1, 2005", 7);
       Books book2 = new Books("BO2", "Harry Potter", "The Chamber of Secrets", "July 2, 1998", 3);

       Library.addBook(book1);
       Library.addBook(book2);
    }


    @Test
    public void TestSearchExistingBook() {
        Assertions.assertEquals("BO2", books.getCode());
        Assertions.assertEquals("Harry Potter",books.getSeries());
        Assertions.assertEquals("The Chamber of Secrets",books.getName());
        Assertions.assertEquals("July 2, 1998",books.getDate());
        Assertions.assertEquals(3,books.getCopies());
    }

    @Test
    public void TestSearchExistingBookWithError() {
        Assertions.assertEquals("YIN", books.getCode());
        Assertions.assertEquals("Lord of The Rings",books.getSeries());
        Assertions.assertEquals("The Chamber of Secrets",books.getName());
        Assertions.assertEquals("July 2, 1998",books.getDate());
        Assertions.assertEquals(3,books.getCopies());
    }
    @Test
    public void TestAddnewBook() {
        books.setCode("NOM");
        books.setSeries("Percy Jackson");
        books.setName("The Lightning Thief");
        books.setDate("July 1, 2005");
        books.setCopies(7);
    }
}
