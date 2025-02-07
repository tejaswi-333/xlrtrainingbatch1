public class Demo067 {
    //Write a java program to print even elements of an array
    public static void main(String[] args) {
            
        int[] arr = {10, 15, 22, 33, 40, 55, 60};

        System.out.println("Even elements in the array:");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
    
}
