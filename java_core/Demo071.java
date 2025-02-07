public class Demo071 {
    //write a java program to reverse array elements
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args) {
        int[] numbers = {10, 3, 5, 7, 12, 19, 21, 23, 29};
        
        System.out.println("Original array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        reverseArray(numbers);
        
        System.out.println("\nReversed array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
