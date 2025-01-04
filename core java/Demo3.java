// Write java code to find the greatest among 3 variables
public class Demo3 {
    public static void main(String[] args) {
        int a=11;
        int b=66;
        int c=33;

        if (a>b && a>c) {
            System.out.println(a+" is greater than "+b+" and "+c);
        }
        else if(b>c && b>a) {
            System.out.println(b+" is greater than "+a+" and "+c);
        }
        else {
            System.out.println(c+" is greater than "+a+" and "+b);
        }
    }
}
