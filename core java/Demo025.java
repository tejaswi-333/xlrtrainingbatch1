class ReverseString {
    public String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        return new StringBuilder(input).reverse().toString();
    }
}

public class Demo025 {
    public static void main(String[] args) {
        ReverseString obj = new ReverseString();
        
        String str = "123";
        System.out.println(obj.reverse(str)); 
        System.out.println(obj.reverse("Hello")); 
        System.out.println(obj.reverse("")); 
    }
}
