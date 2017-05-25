package _01simple_inner_classes;

class OuterClass {
	int i = 1; // instanceVariable

	void m() {
	} // instanceMethod

	static int staticI = 1; // staticVariable

	static void staticM() {
	} // staticMethod

	// Inner class
	class InnerClass {
		int i = 2;// localvariable overrides outer variable

		public void method() {
			System.out.println("In InnerClass's method");

			i = 1; // OuterClass instanceVariable
			m(); // OuterClass instanceMethod

			staticI = 1; // OuterClass staticVariable
			staticM(); // OuterClass staticMethod

			System.out.println("OuterClass reference=" + OuterClass.this);
			System.out.println("InnerClass reference=" + this);

			OuterClass.this.i = 2;// Accessing OuterClass instanceVariable using
									// OuerClass reference
			OuterClass.this.m();// Accessing OuterClass instanceMethod using
								// OuterClass reference

		}
	} // End InnerClass

	public static void main(String[] args) {
		// Creating instance of InnerClass
		// To Create inner class object outer class object is required
		new OuterClass().new InnerClass().method();
	}
}
