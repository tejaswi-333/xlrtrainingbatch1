package PS002;

class NextMultipleOf100 {
    
    public int getNextMultipleOf100(int num) {
             if (num <= 0)
                 return -1;
             return ((num / 100) + 1) * 100;
        }
    }
    
    public class NM100 {
        public static void main(String[] args) {
            NextMultipleOf100 obj = new NextMultipleOf100();
            int num = 223;
            System.out.println(obj.getNextMultipleOf100(num));
    }
    
}
