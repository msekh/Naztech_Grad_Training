package io.naztech.DIwithList;

import java.util.List;

import lombok.Data;

@Data
public class Library {
	private List<String> stringList;
	private List<Book> bookList;

	public void getBookDetails() {
		List<Book> bList = getBookList();
		/*
		 * for (int i = 0; i < bList.size(); i++) { System.out.println("**Book" + (i +
		 * 1) + " Properties**"); Book book = bookList.get(i);
		 * System.out.println("Book Title        : " + book.getTitle());
		 * System.out.println("Book Author       : " + book.getAuthor());
		 * System.out.println("Book Publications : " + book.getPublications()); }
		 */

		for (Book book : bList) {
			System.out.println(book.getTitle()+"\t"+book.getAuthor()+"\t"+book.getPublications());
		}
	}

}
