package by.htp.task06.tsk01;

public class Library {
	private Book[] books;
	private int count = 0;
	
	public Library() {
		books = new Book[10];
	}
	
	public Library(int size) {
		books = new Book[size];
	}
	
	//-----------------------------------------------------------
	
	public void addBook(Book book) {
		if(count < books.length) {
			books[count] = book;
			count++;
		} else {
			Book[] temp = new Book[books.length + books.length/2];
			for(int i = 0; i < books.length; i++) {
				temp[i] = books[i];
			}
			books = temp;
			books[count] = book;
			count++;
		}
	}
	
	public void addBook(Book[] books) {
		for(Book i : books) {
			this.addBook(i);
		}
	}
	
	public void addBook(Library lib) {
		for(Book i : lib.getBooks()) {
			this.addBook(i);
		}
	}
	
	//-----------------------------------------------------------
	
	public void delBook(Book book) {
		for(int i = 0; i < count; i++) {
			if(this.books[i].equals(book)) {
				for(int j = i; j < count-1; j++) {
					this.books[j] = this.books[j+1];
				}
				this.books[count] = null;
				count--;
			}
		}
	}
	
	//-----------------------------------------------------------
	
	public Book[] getBooks() {
		Book[] temp = new Book[count];
		
		for(int i = 0; i < temp.length; i++) {
			temp[i] = books[i];
		}
		
		return temp;
	}
	
	//-----------------------------------------------------------
	
	public Book[] findAuthor(String author) {
		int cnt = 0;
		for(Book i : this.getBooks()) {
			if(i.getAuthor().equals(author)) {
				cnt++;
			}
		}
		
		Book[] temp = new Book[cnt];
		cnt = 0;
		
		for(Book i : this.getBooks()) {
			if(i.getAuthor().equals(author)) {
				temp[cnt] = i;
				cnt++;
			}
		}
		
		return temp;
	}
	
	public Book[] findIzdatel(String izdatel) {
		int cnt = 0;
		for(Book i : this.getBooks()) {
			if(i.getIzdatel().equals(izdatel)) {
				cnt++;
			}
		}
		
		Book[] temp = new Book[cnt];
		cnt = 0;
		
		for(Book i : this.getBooks()) {
			if(i.getIzdatel().equals(izdatel)) {
				temp[cnt] = i;
				cnt++;
			}
		}
		
		return temp;
	}
	
	public Book[] findYearAfter(int year) {
		int cnt = 0;
		for(Book i : this.getBooks()) {
			if(i.getYear() > year) {
				cnt++;
			}
		}
		
		Book[] temp = new Book[cnt];
		cnt = 0;
		
		for(Book i : this.getBooks()) {
			if(i.getYear() > year) {
				temp[cnt] = i;
				cnt++;
			}
		}
		
		return temp;
	}
}
