public class Demo069 {
    //Write a java program to print sum of all the elements of an array.
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50}; 
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
    }
}

