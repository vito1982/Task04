package by.htp.task06.tsk01;

public class Printer {
	public static void print(Book[] books) {
		System.out.println("----------------------------------------------------------------------");
		for(Book i : books) {
				System.out.println(i);
		}
		System.out.println("----------------------------------------------------------------------\n");
	}
}
