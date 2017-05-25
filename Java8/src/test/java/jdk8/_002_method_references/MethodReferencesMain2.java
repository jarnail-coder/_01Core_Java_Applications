package _002_method_references;

public class MethodReferencesMain2 {
	public static void main(String[] args) {
		Operation operation=(a,b,obj)->{obj.doOperation(a, b);};
		operation.doSomething(2, 3, (a,b)->{System.out.println(a+b);});
		operation.doSomething(2, 3, (a,b)->{System.out.println(a-b);});
		operation.doSomething(2, 3, (a,b)->{System.out.println(a*b);});
		operation.doSomething(2, 3, (a,b)->{System.out.println(a/b);});
	}

	interface Interface {
		public void doOperation(int a, int b);
	}

	interface Operation {
		public void doSomething(int a, int b, Interface intr);
	}
}
