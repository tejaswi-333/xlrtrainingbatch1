import java.util.Scanner;
public class Test002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//understanding while loop iteration 
        while(true){
        System.out.println("Enter do u want wishes or not: ");
        String input = sc.nextLine();

        if ("yes".equals(input)) {
            System.out.println("Happy sankranthi");
        }
        else if ("no".equals(input)){
            System.out.println("good bye");
            break;
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
}


        
