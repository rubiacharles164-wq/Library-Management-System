import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LibraryTest{

    @BeforeEach
    void setup(){
       Books book1 = new Books("BO1", "Percy Jackson", "The Lightning Thief", "July 1, 2005");
       Books book2 = new Books("BO2", "Harry Potter", "The Chamber of Secrets", "July 2, 1998");

       new Library.addBookSetup(book1, book2);

    }
    @Test
    public void TestDisplayAllBooks(){
        new Library.displayAllBooks();
    }

    @Test //works But Throws IOExceoptions
    public void TestSearchByCode() throws IOException {
        new Library.findBookByCode("BO2");
    }
    @Test
    public void TestSearchByCodeWithError() throws IOException {
        new Library.findBookByCode("BO6");
    }

    @Test   //works But Throws IOExceoptions
    public void TestSearchBySeries() throws IOException {
        new Library.findBookBySeries("Percy Jackson");
    }
    @Test
    public void TestSearchBySeriesWithError() throws IOException {
        new Library.findBookBySeries("Diary of a Wimpy Kid");
    }

    @Test
    public void TestAddNewBook() throws IOException {
        Books newBook = new Books("BO3", "Lord of The Rings", "The Two Towers", "November, 11 1954");
        new Library.addNewBook(newBook);
    }
    @Test
    public void TestAddNewBookWithError() throws IOException {
        Books newBook = new Books("BO1", "Percy Jackson", "The Lightning Thief", "July 1, 2005");
        new Library.addNewBook(newBook);
    }

    @Test
    public void TestDeleteBook() throws IOException {
        Books deleteBook = new Books("BO3", "Lord of The Rings", "The Two Towers", "November, 11 1954");
        new Library.deleteBook(deleteBook);
    }

    @Test //doesnt work, not sure how to check specifically just one part then alter the rest of one class
    public void TestupdateBook() throws IOException {
        Books updateNew = new Books("BO1", "Lord of The Rings", "The Two Towers", "November, 11 1954");
        new Library.updateByID("BO1", updateNew);
    }
    @Test
    public void TestupdateBookWithError() throws IOException {
        Object update = "BO4";
        Books updateNew = new Books("BO4", "Lord of The Rings", "The Two Towers", "November, 11 1954");
        new Library.updateByID(update, updateNew);
    }
}
