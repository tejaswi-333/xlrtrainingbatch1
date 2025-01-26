public class Test001{
    //print digits 1 to 10 except 5 and 7
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            if(i==5 || i==7){
                continue;
            }
            System.out.println(i);
        }
    }
}
