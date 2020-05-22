package app.helpers;

import app.book.Books;

import java.util.Comparator;

public class BookNameComparator implements Comparator<Books> {
	public int compare(Books o1, Books o2) {

		return o1.getName().compareTo(o2.getName());
	}

	@Override
	public Comparator<Books> reversed() {
		return null;
	}

}
