package app;

import app.book.Books;
import app.book.FictionBook;
import app.book.ProgrammingBook;
import app.helpers.Helpers;

import java.util.Scanner;

public class AppTest {
	public static void main(String[] args) {
		lauch();
	}
	public static void lauch(){
		// Helpers books
		Helpers helpers = new Helpers();

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

		// list of 10 books
		Books[] books = {javaProgrammingBook_volume1, javaProgrammingBook_volume2, phpProgrammingBook, javaProgrammingBook_all, javascriptProgrammingBook, theFlash_FictionBook, magician_FictionBook, pyramid_FictionBook, devilsTriangle_FictionBook, rattanGarden_FictionBook};

		// get total price
		getTotalPrice(books, helpers);

		// Số sách ProgrammingBook có language là "Java"
		countProgrammingBook(books, helpers);

		// Tìm tên sách và hiện giá
		findNameAndViewPrice(books, helpers);

		// Sắp sếp nổi bọt
		//helpers.bubblesSortByPrice(books);

		// Sắp sếp chèn
		//helpers.insertSortByPrice(books);

		// Sắp sếp chọn
		//helpers.selectSortByPrice(books);

		// Sắp xếp tên sách theo thứ tự A-Z
		helpers.sortByName(books);

		// Tìm tên nhị phân
		binarySearchByName(books, helpers);
	}

	// get total price
	public static void getTotalPrice(Books[] books, Helpers helpers){
		double totalPrice = helpers.getTotalPriceBooks(books);
		System.out.println("Tổng giá " + books.length + " cuốn sách là: " + totalPrice);
	}

	// Số sách ProgrammingBook có language là "Java"
	public static void countProgrammingBook(Books[] books, Helpers helpers){
		int countJavaBook = helpers.countProgrammingBook(books);
		System.out.println("Số sách ProgrammingBook có language là Java: " + countJavaBook);
	}

	// Tìm tên sách và hiện giá
	public static void findNameAndViewPrice(Books[] books, Helpers helpers){
		System.out.print("Nhập tên sách để tìm giá (tìm tuần tự): ");

		Scanner scanner = new Scanner(System.in);
		String name     = scanner.nextLine();
		Books result    = helpers.getBookByName(books, name);
		if (result == null){
			System.out.println("Không tìm thấy sách có tên: " + name);
		}else{
			System.out.println("Sách tên " + name + " có giá là: " + result.getPrice());
		}
	}

	// Tìm tên nhị phân
	public static void binarySearchByName(Books[] books, Helpers helpers){
		System.out.print("Nhập tên sách để tìm giá (tìm nhị phân): ");

		Scanner scanner = new Scanner(System.in);

		scanner = new Scanner(System.in);
		String name2     = scanner.nextLine();
		Books result2    = helpers.binarySearchByName(books, name2);
		if (result2 == null){
			System.out.println("Không tìm thấy sách có tên: " + name2);
		}else{
			System.out.println("Sách tên " + name2 + " có giá là: " + result2.getPrice());
		}
	}
}
