public class LeetCode001 {
    public static boolean isPalindrome(int x) {
            String tt=Integer.toString(x);
            for(int i=0;i<tt.length();i++){
             int start=tt.charAt(i);
             int end=tt.charAt(tt.length()-1-i);
            
            if(start != end){
             return false;
            }
            }
            return true;
         }
         public static void main(String[] args) {
            int x=111;
            System.out.println(isPalindrome(x));
     }
}
