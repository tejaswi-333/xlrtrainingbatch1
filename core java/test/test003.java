package test;

import java.util.Scanner;

class Grocery{
    int item_no;
    String item_name;
    int quantity;
    double price;
    double total;

    Grocery(int item_no,String item_name,int quantity,double price,double total) {
        this.item_no=item_no;
        this.item_name=item_name;
        this.quantity=quantity;
        this.price=price;
        this.total=total;
    }

    public void calculate() {
        //price * quantity
    }
}

class test003 {
    Scanner sc=new Scanner(System.in);
    int item_no;
    String item_name;
    int quantity; //scanner print
    double price;
    double total;


}
//no name quan price total
