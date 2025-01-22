class SumOf2Digits {
    public static void main(String[] args) {
        int n = 66;
        int first = n / 10;
        int last = n % 10;
        int sum = first + last;

        System.out.println("The sum of 2 digits of "+n+" is "+first+"+"+last+"="+sum);
    }
}
