import java.util.Scanner;
class demo026{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        //find only number of vowels and consonants in a string
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o' || ch == 'u') {
                    vowels++;
                    } else {
                        consonants++;
                        }
                        }
                        
                        System.out.println("Number of vowels: " + vowels);
                        System.out.println("Number of consonants: " + consonants);
                    }                      

                }