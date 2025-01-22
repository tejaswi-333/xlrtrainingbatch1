import java.util.ArrayList;  

public class Demo029 {
    void arrayListMethod() {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("harsha");
        friends.add("priya");
        friends.add("nandu");
        friends.add("teju");
        friends.add("tharuni");
        friends.add("kavita");

        System.out.println("Elements of the list: ");
        for (String name : friends) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Demo029 obj = new Demo029(); 
        obj.arrayListMethod();
    }
}
