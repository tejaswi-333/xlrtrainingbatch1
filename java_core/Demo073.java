//write a java program to print duplicate elements of an array
class DuplicateFinder {
    void duplicate(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { 
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + " is duplicate");
                    break; 
                }
            }
        }
    }
}


public class Demo073 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 4, 55, 66, 43};
        DuplicateFinder finder = new DuplicateFinder();
        finder.duplicate(arr);
    }
}
