
//write a java program to sort an array without predefined methods. --- Accenture
public class Demo074 {
    public static void main(String[] args) {
            int[] arr = {8, 3, 7, 4, 1, 9};
            BubbleSort.bubbleSort(arr);
            System.out.println("Sorted array:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
    }
    
    class BubbleSort {
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            boolean swapped;
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                        swapped = true;
                    }
                }
               
                if (!swapped) break;
            }
        }
    }
    