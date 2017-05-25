package _001regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain03 {

	private static final String REGEX = "\\bcat\\b";
	private static final String INPUT = "cat cat. cat, cat| cat+ +cat cattie cat";

	public static void main(String args[]) {
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT); // get a matcher object
		int count = 0;

		while (m.find()) {
			count++;
			System.out.println("----------------------------");
			System.out.println("LookingAt:" + m.lookingAt());
			System.out.println("Match number:" + count);
			System.out.println("start(): " + m.start());
			System.out.println("end(): " + m.end());
			System.out.println("Matched:" + m.group());
		}
	}
}
