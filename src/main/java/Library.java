import org.junit.jupiter.api.Assertions;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Library {
    static List<Books> library = new ArrayList<>();


    public static class addBookSetup {
        public addBookSetup(Books book1, Books book2) {
            library.add(book1);
            library.add(book2);

        }
    }


    public static class displayAllBooks {

        public displayAllBooks(){
            for (int i = 0; i < library.size(); i++){
                System.out.println(library.get(i).toString());
                System.out.println();
            }
        }
    }

    public static class findBookBySeries {
        public findBookBySeries(String findBook) {

            for (int i = 0; i < library.size(); i++){
                if (findBook.equals(library.get(i).getSeries()))
                 System.out.println(library.get(i).toString());
            }
        }
    }

    public static class addNewBook {
        public addNewBook(Books newBook) throws IOException {
            for (int i = 0; i < library.size(); i++) {
                if (newBook.equals(library.get(i)))
                    throw new IOException("Books Already exists in Library");
                else {
                    library.add(newBook);
                    System.out.println("Added " + newBook + "to the library!");
                }
            }
        }
    }

    public static class deleteBook {
        public deleteBook(Books deleteBook) throws IOException{
            for (int i = 0; i < library.size(); i++) {
                if (!deleteBook.equals(library.get(i)))
                    throw new IOException("Book does not exist in Library");
                else {
                    library.remove(deleteBook);
                    System.out.println(deleteBook + " Has been deleted from library Data");
                }
            }
        }
    }
}


