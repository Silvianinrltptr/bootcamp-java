package com.javaprogram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExample {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Sebelum wisuda");
		names.add("Harus udah kerja");
		names.add("Bismilah");
		names.add("Diposisi QA Automation");
		names.add("magang/kerja dan paid");
		names.add("Sebelum wisuda");
		
		names.add(5, "SilvianiNurlitaPutri");
	
		
		for (String item : names) {
			System.out.println(item);

		}
		
		HashSet<Integer> rollNumbers = new HashSet<> () ; 
		rollNumbers.add(101);
		rollNumbers.add(102);
		rollNumbers.add(201);
		rollNumbers.add(201);
		rollNumbers.add(401);
		
		for (int item : rollNumbers) {
			System.out.println(item);
		}
		HashSet<String> newNames = new HashSet<>();
		newNames.add("Silviani");
		newNames.add("Nurlita");

		for (String item : newNames) {
			System.out.println(item);
		}
		
			HashMap<Integer, String> favoriteNumber = new HashMap<>();
			favoriteNumber.put(2, "Silviani");
			favoriteNumber.put(6, "Nurlita");
			favoriteNumber.put(19, "Putri");
			favoriteNumber.put(20, "Fathur");
			favoriteNumber.put(28, "Rahman");
			favoriteNumber.put(24, "Fauzan");
			
			for (Integer key : favoriteNumber.keySet()) {
				System.out.println("Favorite Number of " + favoriteNumber.get (key)+ " is " + key);
			}
			
			System.out.println("Favorite Number of " + favoriteNumber.get (27)+ " is " + 27);
			
	}
}




