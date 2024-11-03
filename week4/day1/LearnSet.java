package week4.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		
		Set<String> names1 = new HashSet<String>();
		names1.add("Vinothini");
		names1.add("Karthick");
		System.out.println(names1.add("RajMohan"));
		names1.add("Sangameswari");
		names1.add("Saranya");
		names1.add("Baskar");
		System.out.println(names1.add("RajMohan"));
		System.out.println(names1);
		
		
		
		Set<String> names2 = new TreeSet<String>();
		names2.add("Vinothini");
		names2.add("Karthick");
		System.out.println(names2.add("RajMohan"));
		names2.add("Sangameswari");
		names2.add("Saranya");
		names2.add("Baskar");
		System.out.println(names2.add("RajMohan"));
		System.out.println(names2);
		
		
		Set<String> names3 = new LinkedHashSet<String>();
		names3.add("Vinothini");
		names3.add("Karthick");
		System.out.println(names3.add("RajMohan"));
		names3.add("Sangameswari");
		names3.add("Saranya");
		names3.add("Baskar");
		System.out.println(names3.add("RajMohan"));
		System.out.println(names3);
		
		
		//To get particular value from set based on the Index position. --- > Convert the set into list
		List<String> listNames1 = new ArrayList<String>(names3);
//		listNames1.addAll(names3);
		System.out.println(listNames1.get(3));
		
		names1.clear();
		System.out.println(names1);
		System.out.println(names1.remove("Gokul"));
		
	}
	
	
}
