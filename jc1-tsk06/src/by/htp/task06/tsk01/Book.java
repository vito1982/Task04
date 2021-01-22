package by.htp.task06.tsk01;

public class Book {
	private int id;
	private int year;
	private int pages;
	private int price;
	private String name;
	private String author;
	private String izdatel;
	private String pereplet;
	
	public Book() {}
	
	public Book(String name, String author, String izdatel) {
		this.name = name;
		this.author = author;
		this.izdatel = izdatel;
		
		this.id = 0;
		this.year = 0;
		this.pages = 0;
		this.price = 0;
		this.pereplet = "";
	}
	
	public Book(String name, String author, String izdatel, int year, int pages) {
		this(name, author, izdatel);
		this.year = year;
		this.pages = pages;
		
		this.id = 0;
		this.price = 0;
		this.pereplet = "";
	}
	
	public Book(int id, String name, String author, String izdatel, int year, int pages, 
				int price, String pereplet) {
		this(name, author, izdatel, year, pages);
		this.id = id;
		this.price = price;
		this.pereplet = pereplet;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getPages() {
		return pages;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	
	public void setIzdatel(String izdatel) {
		this.izdatel = izdatel;
	}
	public String getIzdatel() {
		return izdatel;
	}
	
	public void setPereplet(String pereplet) {
		this.pereplet = pereplet;
	}
	public String getPereplet() {
		return pereplet;
	}
	
	public String toString() {
		return id+ " - "+ name + " - " + author + " - "+ izdatel +" - " + year + " - " + pages + " - " + price + " - " + pereplet;
	}
}
