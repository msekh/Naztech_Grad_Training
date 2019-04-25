package io.mtech.controller;

enum Books{
	HARRY_POTTERS("Harry Potter",856, 12.99),
	THE_SOULFORCE("The Soulforce",123,12.11),
	GAME_OF_THRONES ("Game of Thrones", 567, 10.00),
	 DRAGONLANCE ("Dragonlance", 456, 6.77);
	
	private final String representations;
    private final int pages;
    private final double price;
    // order of fields matter
    Books(String representations, int pages, double price) {
        this.representations = representations;
        this.pages = pages;
        this.price = price;
    }
	public String getRepresentations() {
		return representations;
	}
	public int getPages() {
		return pages;
	}
	public double getPrice() {
		return price;
	}
    
	
}
public class EnumWithConstructorEx2 {
public static void main(String args[]) {
	
	Books []books=Books.values();
	for(Books book :books  ) {
		System.out.println("Book Name: "+ book.getRepresentations()+" "+" Number of pages: "+
	book.getPages()+" Price: "+book.getPrice());
	}
}
}
