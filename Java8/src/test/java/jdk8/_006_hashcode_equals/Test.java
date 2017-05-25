package _006_hashcode_equals;

class Test {
	public static void main(String[] args) {
		A objA = new A();
		B objB = new B();
		System.out.println((objA.getClass() == objB.getClass()));
		System.out.println(objB instanceof A);

		System.out.println((objA.getClass() == objB.getClass()));
		System.out.println(objA instanceof B);
	}
}

class A {

}

class B extends A {

}
