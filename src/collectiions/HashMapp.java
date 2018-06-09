package collectiions;

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class HashMapp {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		HashMap<String, Boolean> hm = new HashMap<String, Boolean>();
		Hashtable<String, Integer> tb = new Hashtable<String, Integer>();
		HashSet<String> hs = new HashSet<String>();

		map.put("raj", 12);
		map.put("sam", 56);
		map.put("ram", 22);
		map.put("tom", 29);
		map.put("ram", 33);

		hm.put("lucky", true);
		hm.put("dusty", false);

		for (Map.Entry<String, Integer> value : map.entrySet()) {
			System.out.println("Key :" + value.getKey() + " Value :" + value.getValue());
		}

		System.out.println(map.get("raj"));

		map.remove("sam");

		if (map.containsKey("sam")) {
			System.out.println(map.keySet());
			System.out.println(map.entrySet());
		}

		if (map.containsValue("33")) {
			System.out.println("yes");
		}

	}

}
