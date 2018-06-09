package enumeratin;

import java.util.EnumSet;

public class Enumer {

	public static void main(String[] args) {
		
		for(EnumerVariable people : EnumerVariable.values()) {
			System.out.printf("%s \t %s \t %s \n", people,people.todesc(),people.toage());
			
		}
		
		System.out.println();
		System.out.println("And the next range is :");
		System.out.println();
		
		for (EnumerVariable plux : EnumSet.range(EnumerVariable.ALLUARJUN, EnumerVariable.jrntr)){
			System.out.printf("%s \t %s \t %s\n", plux,plux.todesc(),plux.toage());
		}
			
		
	}

}
