import java.util.ArrayList;
import java.util.List;

//Library class purpose to form Arraylist
public class Library {
    static List<Books> library = new ArrayList<>();


    public static class addBookSetup {
        public addBookSetup(Books book1, Books book2) {
            library.add(book1);
            library.add(book2);
        }
    }

    //All methods cycle through the library checking each object, used in assertions during the test
    public static class displayAllBooks {

        public displayAllBooks() {
            for (int i = 0; i < library.size(); i++) {
                System.out.println(library.get(i).toString());
                System.out.println();
            }
        }
    }


    public static class findBookByCode {
        public findBookByCode(String FindbyCode) {
            for (int i = 0; i < library.size(); i++) {
                if(FindbyCode.equals(library.get(i).getCode()))
                    return;
                else {
                     System.out.println(library.get(i).toString());
                }
            }
        }
    }


    public static class findBookBySeries {
        public findBookBySeries(String FindbySeries) {
            for (int i = 0; i < library.size(); i++) {
                if(!FindbySeries.equals(library.get(i).getSeries()))
                    return;
                else {
                    System.out.println(library.get(i).toString());
                }
            }
        }
    }

    //if assertion doesn't throw false add, delete and update should also do their as their names to the library
    public static class addNewBook {
        public addNewBook(Books newBook) {
            for (int i = 0; i < library.size(); i++) {
                if(!newBook.equals(library.get(i)))
                    return;
                else{
                    library.add(newBook);
                    System.out.println("Added " + newBook + "to the library!");
                }

            }
        }
    }


    public static class deleteBook {
        public deleteBook(Books deleteBook) {
            for (int i = 0; i < library.size(); i++) {
                if(!deleteBook.equals(library.get(i)))
                    return;
                else {
                    library.remove(deleteBook);
                    System.out.println(deleteBook + " Has been deleted from library Data");
                }
            }
        }
    }



    public static class updateByID {
        public updateByID(Object update, Books updateNew) {
            for (int i = 0; i < library.size(); i++) {
                if(!updateNew.equals(library.get(i)))
                    return;
                else {
                    library.remove(update);
                    library.add(updateNew);
                }
            }
        }
    }
}



