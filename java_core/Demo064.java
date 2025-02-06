 import java.util.Arrays;
 
 public class Demo064 {
    //Write a java program to swap 1st and last elements in an array
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};  
        System.out.println("Original Array: " + Arrays.toString(arr));

        if (arr.length > 1) {
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;
        }

        System.out.println("Array after swapping first and last elements: " + Arrays.toString(arr));
    }
}

        
    

