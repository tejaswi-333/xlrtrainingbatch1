class StringContainsVowels {	
	public static boolean stringContainsVowels(String input) {
		return input.toLowerCase().matches(".*[aeiou].*"); 
	}
}

public class Demo026 {
    public static void main(String[] args) {
		System.out.println(StringContainsVowels.stringContainsVowels("Hello")); 
		System.out.println(StringContainsVowels.stringContainsVowels("TV")); 
	}
}


