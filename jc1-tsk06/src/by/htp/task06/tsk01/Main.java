package by.htp.task06.tsk01;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("Java", "Ivanov", "MinskPress", 2000, 200);
		Book b2 = new Book("C++", "Ivanov", "MinskPress", 1995, 100);
		Book b3 = new Book("SuperPC", "Petrov", "MoscowPress", 2002, 250);
		Book b4 = new Book("Hardware", "Petrov", "MoscowPress", 1998, 300);
		Book b5 = new Book(1001, "JavaScript", "Fedorov", "MoscowPress", 2010, 500, 20, "hard");

		Library lib1 = new Library();
		
		lib1.addBook(b1);
		lib1.addBook(b2);
		lib1.addBook(b3);
		lib1.addBook(b4);
		lib1.addBook(b5);
				
		Printer.print(lib1.getBooks());
		
		Printer.print(lib1.findAuthor("Ivanov"));
		Printer.print(lib1.findIzdatel("MoscowPress"));
		Printer.print(lib1.findYearAfter(2000));
		
		lib1.delBook(b2);
		
		Printer.print(lib1.getBooks());
		
		Library lib2 = new Library();
		lib2.addBook(lib1.getBooks());
		lib2.addBook(lib1.getBooks());
		
		Printer.print(lib2.getBooks());
		
		Library lib3 = new Library();
		lib3.addBook(lib1);
		lib3.addBook(lib2);
		
		Printer.print(lib3.getBooks());
		
		Printer.print(lib3.getBooks());
		
		
	}

}
