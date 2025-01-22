import java.util.ArrayList;

class Demo030 {
    void arrayListMethod() {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(100);
        arrayList1.add(200);
        arrayList1.add(100);
        arrayList1.add(0);
        arrayList1.add(900);
        arrayList1.add(600);

        System.out.println("Elements of the list: ");
        for (int num : arrayList1) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        Demo030 obj = new Demo030();  
        obj.arrayListMethod();
    }
}



