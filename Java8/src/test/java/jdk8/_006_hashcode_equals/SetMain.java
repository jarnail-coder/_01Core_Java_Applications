package _006_hashcode_equals;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class SetMain {
	public static void main(String[] args) {
		Set<Emp> set = new HashSet<>();
		set.add(new Emp("aman", 21));
		set.add(new Emp("aman", 21));
		set.add(new Emp("aman", 21));
		set.add(new Emp("aman", 21));
		set.stream().forEach(System.out::println);
	}

}

class Emp {
	String name;
	int age;

	public Emp(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		// Wrong Implementation of hasCode
		int hashcode = new Random().nextInt(10);
		System.out.println(hashcode);
		return hashcode;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", age=" + age + "]";
	}

}