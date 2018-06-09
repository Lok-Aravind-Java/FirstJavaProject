package com.apptrics.javabasics;

public class Basic2 {

	public static void main(String[] args) {
		String s1 = "6.1.0";
		String s2 = "6.1.0";

		String result = isUpgrade(s1, s2);

		System.out.println();
	}

	public static String isUpgrade(String s1, String s2) {

		String[] arr1 = s1.split(".");
		String[] arr2 = s2.split(".");
		String result = "Upgraded";

		if (arr1.length == arr2.length) {

			for (int i = 0; i < arr1.length; i++) {

				if (arr1[i].equals(arr2[i])) {
					
					result = "Equal";

				} else if(arr1.length>arr2.length){
		
					
				}else {
					
					
					
				}
				
				
				
				
				

			}
		}else{
			
			
			
		}

		return result;
	}
}