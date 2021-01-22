package by.htp.task06.tsk02;

import java.util.ArrayList;

public class Bank {
	private ArrayList<Customer> customers = new ArrayList<>();
	
	//--------------------------------------------------------	
	
	public Bank() {}
	
	public Bank(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	
	//--------------------------------------------------------
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public void addCustomer(Bank bank) {
		for(Customer i : bank.getCustomers()) {
			customers.add(i);
		}
	}
	
	public void deleteCustomer(Customer customer) {
		customers.remove(customer);
	}
	
	//--------------------------------------------------------
	
	public ArrayList<Customer> getCustomers(){
		return customers;
	}
	
	public ArrayList<Customer> findByCardNumber(int a1, int a2){
		ArrayList<Customer> list = new ArrayList<>();
		
		for(Customer i : customers) {
			if(i.getCardNumber() >= a1 && i.getCardNumber() <= a2) {
				list.add(i);
			}
		}
		
		return list;
	}
	
	public void sortByName() {
		int comp;
		for(int i = 0; i < customers.size()-1; i++) {
			for(int j = i+1; j < customers.size(); j++) {
				comp = compareString(customers.get(i).getSecondName(), customers.get(j).getSecondName()); 
				if(comp > 0) {
					swapCustomer(i, j);
				} else if (comp == 0) {
					comp = compareString(customers.get(i).getFirstName(), customers.get(j).getFirstName());
					if(comp > 0) {
						swapCustomer(i, j);
					} else if (comp == 0) {
						comp = compareString(customers.get(i).getThirdName(), customers.get(j).getThirdName());
						if(comp > 0) {
							swapCustomer(i, j);
						}
					}
				}
			}
		}
	}
	
	private int compareString(String s1, String s2) {
		int cmp = 0;
		int min;		
		
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();

		if(s1.length() < s2.length()) {
			min = s1.length();
		} else {
			min = s2.length();
		}
		
		for(int i = 0; i < min; i++) {
			cmp = s1.charAt(i) - s2.charAt(i);
			if(cmp > 0 || cmp < 0) {
				break;
			}
		}
		
		if(cmp == 0) {
			if(s1.length() > s2.length()) {
				cmp = 1;
			} else if (s1.length() < s2.length()){
				cmp = -1;
			}
		}
		
		return cmp;
		//return s1.compareTo(s2);
	}
	
	private void swapCustomer(int i, int j) {
		Customer temp = customers.get(i);
		customers.set(i, customers.get(j));
		customers.set(j, temp);
	}
}
