import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class LibraryTest{

    @Test
    public void TestAddBook() {

        Books newBook = new Books();
            newBook.setCode("YUT");
            newBook.setSeries("Lord Of The Rings");
            newBook.setName("The Two Towers");
            newBook.setDate("November 11, 1954");
            newBook.setCopies(4);

        List<Books> books = new ArrayList<Books>();
            books.add(newBook);


        //for (Books b : books) {
        //    System.out.println("Code: " + b.getCode() + " Series: " + b.getSeries() + " name: " + b.getName() +" Date: " + b.getDate() + " Copies: " + b.getCopies());
        //}
    }

    @Test
    public void displayLibrary(){

    }

}
