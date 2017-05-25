package _002properties_files;

import java.util.Optional;

public class Tesgt {
	public static void main(String[] args) {
		A a = null;
		if(Optional.ofNullable(a.show()).isPresent()){
			System.out.println("ss");
		}
//		System.out.println("ss");
	}

	
}

class A {
	String show() {
		return null;
	}
}
