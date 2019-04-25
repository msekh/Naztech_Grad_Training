package io.naztech.xmlConfig;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Book {
	private String title;
	private String publications;
	private String author;
	
	public void init() {
		System.out.println("Book details: "+ this);
	}
	public void getBookDetails()
    {
        System.out.println("**Published Book Details**");
        System.out.println("Book Title        : " + title);
        System.out.println("Book Author       : " + author);
        System.out.println("Book Publications : " + publications);
    }
}
