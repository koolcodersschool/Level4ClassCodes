package day11;

public class StringBuilderDemo {
	
	public static void main(String[] args) {
		
		String str ="java";
		str += "selenium";
		System.out.println(str);
		
		String s = "Hello";
		if("Hello" == s) {
			System.out.println("hiiiiiii");
		}
		
		StringBuilder stb = new StringBuilder("java");
		stb.append(", selenium");
		
		System.out.println("stb = " + stb);
		stb.append(", git").append(", html");
		
		System.out.println("stb = " + stb);
		
		StringBuilder stb2 = new StringBuilder("Yusif");
		stb2.append(", Kerim").append(", Ali").append(", Murad");
		System.out.println("stb2 = " + stb2);
		stb2.reverse();
		System.out.println("reversed stb2 = " + stb2);
		
		String checkStr = "civic";
		StringBuilder stBuilder = new StringBuilder(checkStr);
		stBuilder.reverse();
		if(stBuilder.toString().equals(checkStr)) {
			System.out.println(checkStr + " is Polindrome");
		}else {
			System.out.println(checkStr + " is NOT Polindrome");
		}
		
		System.out.println(isPolindrome("mom"));
		System.out.println(isPolindrome("Murad"));
		System.out.println(isPolindrome("nurses run"));
		System.out.println(isPolindrome("race car"));
		
	}
	
	public static boolean isPolindrome(String word) {
		word = word.replace(" ", "");
		return new StringBuilder(word).reverse().toString().equalsIgnoreCase(word);
	}

}
