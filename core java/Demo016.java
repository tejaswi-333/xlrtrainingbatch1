public class Demo016 {
	static boolean isPalindromeOf3Digits(int n) {
        return (n / 100) == (n % 10);
    }
    public static void main(String[] args) {
		int n = 131;
		System.out.println(isPalindromeOf3Digits(n));
    }
}

