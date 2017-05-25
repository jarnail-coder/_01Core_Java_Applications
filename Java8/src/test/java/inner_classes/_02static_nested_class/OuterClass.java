package _02static_nested_class;

class OuterClass {
	// StaticNestedClass
	static class StaticNestedClass {

		// StaticNestedClass can declare static initialization blocks
		static {
		}

		// StaticNestedClass can declare member interfaces.
		interface I {
		}

		// StaticNestedClass can declare static members
		static int i = 2;

		// StaticNestedClass can declare constant variables
		static final int j = 3;

		// StaticNestedClass classes can declare instance initialization blocks
		{
		}

		// StaticNestedClass constructor
		StaticNestedClass() {
		}

		// Static method can be declared
		static void m() {
		}

		void m1() {
		}

	}// inner class

	public static void main(String[] args) {
		// Creating instance of InnerClass
		// To Create inner class object outer class object is required
		OuterClass.StaticNestedClass.m();
		// TO Call non static method
		new OuterClass.StaticNestedClass().m1();
	}
}
