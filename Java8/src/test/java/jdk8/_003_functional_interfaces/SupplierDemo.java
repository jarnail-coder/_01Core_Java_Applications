package _003_functional_interfaces;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<String> supplier=new DemoSupplier();
		System.out.println(supplier.get());
		System.out.println(supplier.get());
		System.out.println(supplier.get());
				
	}
}

class DemoSupplier implements Supplier<String> {

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "My Name is Jarnail:" + new Random().nextInt();
	}

}
