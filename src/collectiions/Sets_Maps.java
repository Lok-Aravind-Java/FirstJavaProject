package collectiions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Sets_Maps {

	public static void main(String[] args) {

		Set<Person> set = new HashSet<Person>();
		Map<Integer, Person> map = new HashMap<Integer, Person>();

		Person p1 = new Person(0, "tom");
		Person p2 = new Person(1, "sue");
		Person p3 = new Person(2, "dom");
		Person p4 = new Person(1, "sue");

		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);

		System.out.println(set);

		map.put(0, p1);
		map.put(1, p2);
		map.put(2, p3);
		map.put(1, p4);

		map.forEach((k, v) -> {
			System.out.println("The key is " + k + "Value is :" + v);
		});

	}
}

class Person {
	int id;
	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
