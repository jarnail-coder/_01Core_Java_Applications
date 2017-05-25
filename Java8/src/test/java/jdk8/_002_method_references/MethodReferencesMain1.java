package _002_method_references;

import java.util.Arrays;

public class MethodReferencesMain1 {
	public static void main(String[] args) {
		Stu[] stusArr = new Stu[] { new Stu(10, "Vikram"), new Stu(30, "Rohit"), new Stu(40, "Seema"),
				new Stu(20, "Geetika") };
		for (Stu stu : stusArr) {
			System.out.println(stu);
		}

		System.out.println("##Sort By Age##");
		Arrays.sort(stusArr, (stu1, stu2) -> stu1.age - stu2.age);
		for (Stu stu : stusArr) {
			System.out.println(stu);
		}

		System.out.println("##Sort By Name##");
		Arrays.sort(stusArr, new SortStuByAge()::compareByName);
		for (Stu stu : stusArr) {
			System.out.println(stu);
		}
	}
}

class Stu {
	int age;
	String name;

	public Stu(int age, String name) {
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stu [age=" + age + ", name=" + name + "]";
	}
}

class SortStuByAge {

	public int compareByAge(Stu o1, Stu o2) {
		return o1.age - o2.age;
	}

	public int compareByName(Stu o1, Stu o2) {
		return o1.name.compareTo(o2.name);
	}
}
