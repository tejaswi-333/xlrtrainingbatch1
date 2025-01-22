package test;

import java.util.Scanner;

public class test002 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String reply;
            while(true){
                System.out.print("choose Yes or No: ");
                reply=sc.nextLine();

                if(reply.equals("yes")){
                    System.out.println("Happy Sankranti!");
                }
                else {
                    break;
                }
            } 
            sc.close();
    }
}
