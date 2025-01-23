

class Friend {
    private String name;
    private String address;
    private String phoneNumber;


    public Friend(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

public class demo029 {
    public static void main(String[] args) {
        Friend[] friends = new Friend[10];

        friends[0] = new Friend("Harsha", "kphb", "8523641526");
        friends[1] = new Friend("Nandini", "miyapur", "8456974562");
        friends[2] = new Friend("Priya", "bahadurpally", "9571562635");
        friends[3] = new Friend("Tarak", "kphb", "7895858956");
        friends[4] = new Friend("Srujan", "bachupally", "7152364895");
        friends[5] = new Friend("Nandini", "maharastra", "9985654125");
        friends[6] = new Friend("Harsha", "beeramguda", "7898989564");
        friends[7] = new Friend("Teju", "lingampally", "9548574587");
        friends[8] = new Friend("Priya", "rc puram", "9888875456");
        friends[9] = new Friend("Unknown", "maismmaguda", "7588956562");

        System.out.println("Friends' Details:");
        for (int i = 0; i < friends.length; i++) {
            System.out.println("Name: " + friends[i].getName());
            System.out.println("Address: " + friends[i].getAddress());
            System.out.println("Phone Number: " + friends[i].getPhoneNumber());
            System.out.println();
        }
    }
}
