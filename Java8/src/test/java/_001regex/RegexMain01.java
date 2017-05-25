package _001regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain01 {
	// public static final Logger LOGGER =
	// LoggerFactory.getLogger(RegexMain01.class);

	public static void main(String args[]) {
		// boolean matches() test whether the regular expression matches the
		// pattern.
		// boolean find() finds the next expression that matches the pattern.
		// boolean find(int start) finds the next expression that matches the
		// pattern from the given start number.
		// String group() returns the matched subsequence.
		// int start() returns the starting index of the matched subsequence.
		// int end() returns the ending index of the matched subsequence.
		// int groupCount() returns the total number of the matched subsequence.
		// Exact For Two Characters
		Pattern pattern = Pattern.compile("Am", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("am");
		boolean matches = matcher.matches();
		System.out.println("matcher.matches():" + matches);

		matches = Pattern.matches("am", "bm");
		System.out.println("Pattern.matches(\"am\", \"bm\"):" + matches);

		matches = Pattern.matches("j.....l", "jarnail");
		System.out.println("Pattern.matches(\"j.....l\", \"jarnail\"):" + matches);

		// true (2nd char is s)
		System.out.println(Pattern.matches(".s", "as"));
		// false (2nd char is not s)
		System.out.println(Pattern.matches(".s", "mk"));
		// false (has more than 2 char)
		System.out.println(Pattern.matches(".s", "mst"));
		// false (has more than 2 char)
		System.out.println(Pattern.matches(".s", "amms"));
		// true (3rd char is s)
		System.out.println(Pattern.matches("..s", "mas"));
		System.out.println("##");
		System.out.println(Pattern.matches("[abc]s", "as"));
		System.out.println(Pattern.matches("[abc]s", "bs"));
		System.out.println(Pattern.matches("[abc]s", "cs"));
		System.out.println(Pattern.matches("[abc]s", "ds"));
		System.out.println(Pattern.matches("[abc]s", "As"));
		System.out.println(Pattern.matches("[abc]s", "ass"));
		System.out.println("##[abc] means Or##");
		System.out.println(Pattern.matches(".[abc]s", "aas"));
		System.out.println(Pattern.matches(".[abc]s", "bas"));
		System.out.println(Pattern.matches(".[abc]s", "cas"));
		System.out.println(Pattern.matches(".[abc]..", "abcd"));
		System.out.println(Pattern.matches(".[abc]..", "aDcd"));
		System.out.println("##[^abc] means not##");
		System.out.println(Pattern.matches(".[^abc]s", "aas"));
		System.out.println(Pattern.matches(".[^abc]s", "aAs"));
		System.out.println("##[a-zA-Z] means a-z or A-Z##");
		System.out.println(Pattern.matches("a[a-zA-Z]a", "aaa"));
		System.out.println(Pattern.matches("a[a-zA-Z]a", "aAa"));
		System.out.println(Pattern.matches("a[a-zA-Z]a", "aKa"));
		System.out.println(Pattern.matches("a[a-zA-Z]a", "a1a"));
		System.out.println("##[^a-zA-Z] means not (a-z or A-Z)##");
		System.out.println(Pattern.matches(".[^a-zA-Z]s", "aAs"));
		System.out.println(Pattern.matches(".[^a-zA-Z]s", "a1s"));
		System.out.println(Pattern.matches(".[^a-zA-Z0-9]s", "a1s"));
		System.out.println(Pattern.matches(".[^a-zA-Z0-9]s", "a%s"));
		System.out.println("##[a-c[x-z]] means (a-c or x-z)##");
		System.out.println("##[a-cx-z] means (a-c or x-z)##");
		System.out.println(Pattern.matches(".[a-c[x-z]]a", "a%a"));
		System.out.println(Pattern.matches(".[a-c[x-z]]a", "a%a"));
		System.out.println(Pattern.matches(".[a-c[x-z]]a", "aca"));
		System.out.println(Pattern.matches(".[a-c[x-z]]a", "axa"));
		System.out.println(Pattern.matches(".[a-z[A-Z]]a", "axa"));
		System.out.println(Pattern.matches(".[a-z[A-Z]]a", "a1a"));
		System.out.println("##[a-z&&[e-g]] means (a-z and e-g)##");
		System.out.println(Pattern.matches(".[a-z&&[e-g]]a", "aaa"));
		System.out.println(Pattern.matches(".[a-z&&[e-g]]a", "a1a"));
		System.out.println(Pattern.matches(".[a-z&&[e-g]]a", "afa"));
		System.out.println("##[a-z&&[^e-g]] means (a-z and not e-g)##");
		System.out.println(Pattern.matches(".[a-z&&[^e-g]]a", "afa"));
		System.out.println(Pattern.matches(".[a-z&&[^e-g]]a", "a1a"));
		System.out.println(Pattern.matches(".[a-z&&[^e-g]]a", "aaa"));
		System.out.println(Pattern.matches(".[a-z&&[^e-g]]a", "aaa"));
		System.out.println("##Quantifier## ? means 0 or one time");
		System.out.println(Pattern.matches("a?", "aaa"));
		System.out.println(Pattern.matches("a?", "abc"));
		System.out.println(Pattern.matches("a?", "a"));
		System.out.println(Pattern.matches("a?", "bcd"));
		System.out.println(Pattern.matches("a?", ""));
		System.out.println("##Quantifier## + means one or more time");
		System.out.println(Pattern.matches("a+", "a"));
		System.out.println(Pattern.matches("a+", "aa"));
		System.out.println(Pattern.matches("a+", "aaab"));
		System.out.println(Pattern.matches("a+", "ab"));
		System.out.println(Pattern.matches("a+", "aba"));
		System.out.println(Pattern.matches("a+", "abab"));
		System.out.println(Pattern.matches("a+", "ccc"));
		System.out.println(Pattern.matches("a+", ""));
		System.out.println("##Quantifier## * means 0 or more time");
		System.out.println(Pattern.matches("a*", ""));
		System.out.println(Pattern.matches("a*", "a"));
		System.out.println(Pattern.matches("a*", "aa"));
		System.out.println(Pattern.matches("a*", "aaa"));
		System.out.println(Pattern.matches("a*", "aaab"));
		System.out.println(Pattern.matches("a*", "ab"));
		System.out.println(Pattern.matches("a*", "c"));
		System.out.println("##Quantifier## {x} means x no of time");
		System.out.println(Pattern.matches("a{1}", ""));
		System.out.println(Pattern.matches("a{1}", "a"));
		System.out.println(Pattern.matches("a{2}", "aa"));
		System.out.println(Pattern.matches("a{1}", "ab"));
		System.out.println(Pattern.matches("a{2}", "aba"));
		System.out.println("##Quantifier## {x,} means x or more no of time");
		System.out.println(Pattern.matches("a{0,}", ""));
		System.out.println(Pattern.matches("a{1,}", ""));
		System.out.println(Pattern.matches("a{1,}", "a"));
		System.out.println(Pattern.matches("a{1,}", "aa"));
		System.out.println(Pattern.matches("a{1,}", "ab"));
		System.out.println(Pattern.matches("a{2,}", "a"));
		System.out.println(Pattern.matches("a{2,}", "aa"));
		System.out.println(Pattern.matches("a{2,}", "aab"));
		System.out.println("##Quantifier## {x,y} means min x and max y no of time");
		System.out.println(Pattern.matches("a{0,2}", ""));
		System.out.println(Pattern.matches("a{0,2}", "a"));
		System.out.println(Pattern.matches("a{0,2}", "aa"));
		System.out.println(Pattern.matches("a{0,2}", "aaa"));
		System.out.println(Pattern.matches("a{0,2}", "aab"));
		System.out.println("##Regex Metacharacters##");
		// . Any character (may or may not match terminator)
		// \d Any digits, short of [0-9]
		// \D Any non-digit, short for [^0-9]
		// \s Any whitespace character, short for [\t\n\x0B\f\r]
		// \S Any non-whitespace character, short for [^\s]
		// \w Any word character, short for [a-zA-Z_0-9]
		// \W Any non-word character, short for [^\w]
		// \b A word boundary
		// \B A non word boundary
		System.out.println(Pattern.matches(".", "a"));
		System.out.println(Pattern.matches(".", "b"));
		System.out.println(Pattern.matches(".", "ba"));
		System.out.println(Pattern.matches(".", "1"));
		System.out.println(Pattern.matches(".", "^"));
		System.out.println("-------------------------------");
		System.out.println(Pattern.matches("\\d", "0"));
		System.out.println(Pattern.matches("\\d", "01"));
		System.out.println(Pattern.matches("\\d", "a"));
		System.out.println("-------------------------------");
		System.out.println(Pattern.matches("\\D", "a"));
		System.out.println(Pattern.matches("\\D", "A"));
		System.out.println(Pattern.matches("\\D", "^"));
		System.out.println(Pattern.matches("\\D", "1"));
		System.out.println(Pattern.matches("\\D*", "1123"));
		System.out.println(Pattern.matches("\\D*", "a123sad"));
		System.out.println(Pattern.matches("\\D*", "asad"));
		System.out.println(Pattern.matches("\\D*", "asadAASS@&*#("));
		System.out.println("-------------------------------");
		System.out.println(Pattern.matches("\\s", "\n"));
		System.out.println(Pattern.matches("\\s", "\t"));
		System.out.println(Pattern.matches("\\s", "\f"));
		System.out.println(Pattern.matches("\\s", "\r"));
		System.out.println(Pattern.matches("\\s", "A"));
		System.out.println(Pattern.matches("\\s", "A"));
		System.out.println("-------------------------------");
		System.out.println(Pattern.matches("\\S", "\n"));
		System.out.println(Pattern.matches("\\S", "@"));
		System.out.println(Pattern.matches("\\S", "1"));
		System.out.println(Pattern.matches("\\S", "A"));
		System.out.println("-------------------------------");
		System.out.println(Pattern.matches("\\w", "A"));
		System.out.println(Pattern.matches("\\w", "a"));
		System.out.println(Pattern.matches("\\w", "1"));
		System.out.println(Pattern.matches("\\w", "@"));
		System.out.println(Pattern.matches("\\w", "\n"));
		System.out.println("-------------------------------");
		System.out.println(Pattern.matches("\\W", "\n"));
		System.out.println(Pattern.matches("\\W", "@"));
		System.out.println(Pattern.matches("\\W", "a"));
		System.out.println(Pattern.matches("\\W", "A"));
		System.out.println("-------------------------------");
		System.out.println(Pattern.matches("[a-zA-Z0-9]*", "A"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]*", "Aasddasc24"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]*", "Aasddasc2\n4"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]*", "##$$Aasddasc24"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "aAbB01"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "aAbB0$"));
		System.out.println("-------------------------------");
		System.out.println(Pattern.matches("\\w*", "123vfdfsDDD"));
		System.out.println("-------------------------------");
		// 10 no digit start with 9 or 8
		System.out.println(Pattern.matches("[98]{1}[0-9]{9}", "9234567890"));
		System.out.println(Pattern.matches("[98]{1}[0-9]{9}", "8234567890"));
		System.out.println(Pattern.matches("[98]{1}[0-9]{9}", "1234567890"));
		System.out.println(Pattern.matches("[98]{1}[0-9]{9}", "8234567890"));
		System.out.println("-------------------------------");
		System.out.println("##A|B means A or B##");
		System.out.println(Pattern.matches("(9|8)", "9"));
		System.out.println(Pattern.matches("9|8", "9"));
		System.out.println(Pattern.matches("9|8", "8"));
		System.out.println(Pattern.matches("9|8", "99"));
		System.out.println(Pattern.matches("9|8", "91"));
		System.out.println(Pattern.matches("9|8", "0"));

	}
}
