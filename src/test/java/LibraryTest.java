import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest{

    //I used assertTrue and assertFalse, as a way to check if the library did or did not consist of the given object
    //In the search by methonds, delete, and update it should be set as error = false and complete = true which should work,
    //Due to some mistake in my code it sees all as false as it cannot exchange findbycode or series as its counterpart in the arraylist
    //add is the only one that seems to follow the correct orientation and functions correctly



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

    @Test
    public void TestSearchByCode() {
        Library.findBookByCode FindbyCode = new Library.findBookByCode("BO2");
        assertFalse(Library.library.contains(FindbyCode));
    }
    @Test
    public void TestSearchByCodeWithError(){
        Library.findBookByCode FindbyCode = new Library.findBookByCode("BO7");
        assertTrue(Library.library.contains(FindbyCode));
    }

    @Test
    public void TestSearchBySeries(){
        Library.findBookBySeries FindbySeries = new Library.findBookBySeries("Percy Jackson");
        assertFalse(Library.library.contains(FindbySeries));
    }
    @Test
    public void TestSearchBySeriesWithError(){
        Library.findBookBySeries FindbySeries = new Library.findBookBySeries("Diary of a Wimpy Kid");
        assertTrue(Library.library.contains(FindbySeries));
    }

    @Test
    public void TestAddNewBook(){
        Books newBook = new Books("BO3", "Lord of The Rings", "The Two Towers", "November, 11 1954");
        assertFalse(Library.library.contains(newBook));
        new Library.addNewBook(newBook);
    }
    @Test
    public void TestAddNewBookWithError(){
        Books newBook = new Books("BO1", "Percy Jackson", "The Lightning Thief", "July 1, 2005");
        assertTrue(Library.library.contains(newBook));
        new Library.addNewBook(newBook);
    }

    @Test
    public void TestDeleteBook(){
        Books deleteBook = new Books("BO2", "Harry Potter", "The Chamber of Secrets", "July 2, 1998");
        assertFalse(Library.library.contains(deleteBook));
        new Library.deleteBook(deleteBook);
    }
    @Test
    public void TestDeleteBookWithError(){
        Books deleteBook = new Books("BO3", "Lord of The Rings", "The Two Towers", "November, 11 1954");
        assertTrue(Library.library.contains(deleteBook));
        new Library.deleteBook(deleteBook);
    }

    @Test
    public void TestupdateBook(){
        Books updateNew = new Books("BO1", "Lord of The Rings", "The Two Towers", "November, 11 1954");
        assertFalse(Library.library.contains(updateNew));
        new Library.updateByID("BO1", updateNew);
    }
    @Test
    public void TestupdateBookWithError(){
        Object update = "BO4";
        Books updateNew = new Books("BO4", "Lord of The Rings", "The Two Towers", "November, 11 1954");
        assertTrue(Library.library.contains(updateNew));
        new Library.updateByID(update, updateNew);
    }
}
