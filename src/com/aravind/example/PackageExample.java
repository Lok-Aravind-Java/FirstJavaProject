package com.aravind.example;

public class PackageExample {

	public static void main(String[] args) {

		String f = "aravind 100 Diamond";
          
		/*String parts[] = f.split("\\s",0);
		String parts[] = f.split("\\s",1);
		String parts[] = f.split("\\s",2);*/
		String parts[] = f.split(" ");
		
		String a = parts[0];
		int b = Integer.parseInt(parts[1]);
		String c = parts[2];

		System.out.println(a + PackageExamp.Seperator +b + c);

	}
}
