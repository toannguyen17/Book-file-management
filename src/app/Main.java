package app;

import app.book.Books;
import app.book.FictionBook;
import app.book.ProgrammingBook;
import app.helpers.BookFileManagement;
import app.helpers.Helpers;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        // Create 5 ProgrammingBook
        ProgrammingBook javaProgrammingBook_volume1 = new ProgrammingBook("javaC0320H1", "JavaPro Volume 1",    100000.0d, "RedT", "Java", "CodeGym");
        ProgrammingBook javaProgrammingBook_volume2 = new ProgrammingBook("javaC0320H1", "JavaPro Volume 2",    110000.0d, "RedT", "Java", "CodeGym");
        ProgrammingBook phpProgrammingBook          = new ProgrammingBook("phpC0320H1",  "PHP All in 1",        120000.0d, "RedT", "Php", "CodeGym");
        ProgrammingBook javaProgrammingBook_all     = new ProgrammingBook("javaC0320H1", "Java ALl in 1",       130000.0d, "RedT", "Java", "CodeGym");
        ProgrammingBook javascriptProgrammingBook   = new ProgrammingBook("javaC0320H1", "JavaScript All in 1", 140000.0d, "RedT", "JavaScript", "CodeGym");

        // Create 5 FictionBook
        FictionBook theFlash_FictionBook       = new FictionBook("C0320H1_4353", "The Flash 1",      180000.0d, "Fiction", "CodeGym");
        FictionBook magician_FictionBook       = new FictionBook("C0320H1_22ee", "Magician",         410000.0d, "Fiction", "CodeGym");
        FictionBook pyramid_FictionBook        = new FictionBook("C0320H1_6543", "Pyramid",          320000.0d, "Fiction", "CodeGym");
        FictionBook devilsTriangle_FictionBook = new FictionBook("C0320H1_1702", "Devil's triangle", 550000.0d, "Fiction", "CodeGym");
        FictionBook rattanGarden_FictionBook   = new FictionBook("C0320H1_9998", "Rattan garden",    290000.0d, "Fiction", "CodeGym");

        List<Books> listProgrammingBook = new ArrayList<>();
        listProgrammingBook.add(javaProgrammingBook_volume1);
        listProgrammingBook.add(javaProgrammingBook_volume2);
        listProgrammingBook.add(phpProgrammingBook);
        listProgrammingBook.add(javaProgrammingBook_all);
        listProgrammingBook.add(javascriptProgrammingBook);


        List<Books> listFictionBook     = new ArrayList<>();
        listFictionBook.add(theFlash_FictionBook);
        listFictionBook.add(magician_FictionBook);
        listFictionBook.add(pyramid_FictionBook);
        listFictionBook.add(devilsTriangle_FictionBook);
        listFictionBook.add(rattanGarden_FictionBook);

        BookFileManagement management = new BookFileManagement();

        // ProgrammingBook File Book
        management.writeFileBook("ProgrammingBook.data", listProgrammingBook);

        List<Books> listTest = management.readFileBook("ProgrammingBook.data", listProgrammingBook);

        listTest.forEach((result)->{
            ProgrammingBook a = (ProgrammingBook) result;
            System.out.println(a);
        });


        // FictionBook File Book
        management.writeFileBook("FictionBook.data", listFictionBook);

        List<Books> listTestFictionBook = management.readFileBook("FictionBook.data", listFictionBook);

        listTestFictionBook.forEach((result)->{
            FictionBook temp = (FictionBook) result;
            System.out.println(temp);
        });
    }
}
