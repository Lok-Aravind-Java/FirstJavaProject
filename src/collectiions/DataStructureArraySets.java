package collectiions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DataStructureArraySets {

	public static String[] Vehicle = { "helicofter", "ambulance", "lifeboat" };

	public static String[][] drivers = { { "tom", "dick", "harry" }, { "sam", "tom", "Casey", "Bob" },
			{ "dick", "tom", "fred", "sue" } };

	public static void main(String[] args) {

		Map<String, Set<String>> person = new HashMap<>();

		for (int i = 0; i < Vehicle.length; i++) {
			String vehicle = Vehicle[i];
			String[] driver = drivers[i];

			Set<String> per = new LinkedHashSet<String>(Arrays.asList(driver));

			/*
			 * for(String list : driver){ per.add(list); }
			 */
			person.put(vehicle, per);

		}

		System.out.println(person);
	}

}
