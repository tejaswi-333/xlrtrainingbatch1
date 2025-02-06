public class Demo055 {
    static void squareSum(int x){
        int sum = 0;
//Write a java program to print sum of squares of a digit of a number.
        while(x!=0){
            int digit = x%10;
            sum = sum + (digit*digit);
            x = x/10;
        }
        System.out.println("Sum of square of digits in "+x+" is: "+sum);
    }

    public static void main(String[] args) {
        int x = 28;
        squareSum(x);
    }
}
