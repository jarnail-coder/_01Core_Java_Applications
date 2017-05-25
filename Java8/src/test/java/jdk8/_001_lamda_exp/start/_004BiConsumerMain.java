package _001_lamda_exp.start;

import java.util.function.BiConsumer;

public class _004BiConsumerMain {
	public static void main(String[] args) {
		// We are passing a value to consumer and mention its behabiour
		print((a,b) -> System.out.println(a+" "+b), "Hello","Java");
		print((a,b) -> System.out.println(a+"-"+b), "Hello","Java");
	}

	// Consumer consume value & return nothing
	public static void print(BiConsumer<String, String> biConsumer, String str, String str1) {
		str = str.toUpperCase();
		str1 = str1.toUpperCase();
		//If You accept then behaviour executes,Otherwise not
		biConsumer.accept(str, str1);
	}
}
