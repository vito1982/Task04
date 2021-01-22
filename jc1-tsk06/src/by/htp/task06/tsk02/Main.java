package by.htp.task06.tsk02;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Customer cust1 = new Customer(40, "Petrov", "Victor", "Ivanovich", "Mogilev", 3050, 100);
		Customer cust2 = new Customer(80, "Ivanov", "Petr", "Petrovich", "Vitebsk", 1080, 300);
		Customer cust3 = new Customer(20, "Sidorov", "Vladimir", "Vladimirovich", "Minsk", 2010, 100);
		
		Bank bank1 = new Bank();
		
		bank1.addCustomer(cust1);
		bank1.addCustomer(cust2);
		bank1.addCustomer(cust3);
				
		Printer.print(bank1.getCustomers());
		
		bank1.sortByName();
		
		Printer.print(bank1.getCustomers());
		
		//-------------------------------------------------------------------------------------------------
		
		ArrayList<Customer> list = new ArrayList<>();
		
		list.add(new Customer(50, "Dornov", "Petr", "Ivanovich", "Gomel", 1020, 300));
		list.add(new Customer(10, "Petrov", "Ivan", "Vladimirovch", "Grodno", 1050, 100));
		list.add(new Customer(60, "dornov", "Petr", "Aleksandrovich", "Brest", 4080, 300));
		list.add(new Customer(70, "Dornov", "Petro", "Aleksandrovich", "Brest", 9020, 100));
		
		Bank bank2 = new Bank(list);
		
		Printer.print(bank2.getCustomers());
		
		bank2.sortByName();
		
		Printer.print(bank2.getCustomers());
		
		//-------------------------------------------------------------------------------------------------
		
		Bank bank3 = new Bank();
		
		bank3.addCustomer(bank1);
		bank3.addCustomer(bank2);
		
		Printer.print(bank3.getCustomers());
		
		bank3.sortByName();
		
		Printer.print(bank3.getCustomers());
		
		Printer.print(bank3.findByCardNumber(3000, 5000));
	}
}