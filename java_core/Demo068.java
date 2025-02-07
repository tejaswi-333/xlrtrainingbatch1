public class Demo068 {
    //Write a java program to print count even numbers of an array
    public static void main(String[] args) {
        int[] arr={10,77,99,44,30};
        for(int num : arr){
            if(num%2==0){
                System.out.print(num+" ");
                
            }
        }
    }
}
