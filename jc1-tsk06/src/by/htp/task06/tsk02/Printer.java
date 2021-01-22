package by.htp.task06.tsk02;

import java.util.ArrayList;

public class Printer {
	public static void print(ArrayList<Customer> list) {
		int[] arrMax = new int[7];
		
		String zagolovok = "ID SName FName TName City CardNumber BankNumber";
		
		findMax(arrMax, zagolovok);
		for(Customer i : list) {
			findMax(arrMax, i.toString());
		}
		
		printLine(formatString(arrMax, zagolovok));
		System.out.println(formatString(arrMax, zagolovok));
		printLine(formatString(arrMax, zagolovok));
		
		for(Customer i : list) {
			System.out.println(formatString(arrMax, i.toString()));
		}
		
		printLine(formatString(arrMax, zagolovok));
		System.out.println();
	}
	
	private static String formatString(int[] arrMax, String str) {
		String[] strs = str.split(" ");
		String rezult = "|";
		
		for(int i = 0; i < strs.length; i++) {
			int d = arrMax[i] - strs[i].length();
			
			for(int j = 0; j < d; j++) {
				strs[i] += " ";
			}
			
			strs[i] += " |";
		}
		
		for(String i : strs) {
			rezult += i;
		}
		
		return rezult;
	}
	
	private static void printLine(String s) {
		System.out.print("|");
		
		for(int i = 0; i < s.length()-2; i++) {
			System.out.print("-");
		}
		
		System.out.print("|\n");
	}
	
	private static void findMax(int[] arrMax, String str) {
		String[] strs = str.split(" ");
		
		for(int i = 0; i < strs.length; i++) {
			if(arrMax[i] < strs[i].length()) {
				arrMax[i] = strs[i].length();
			}
		}
	}
}
