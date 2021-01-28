public class Main {
    public static void main(String[] args) {

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());
        VipCustomer person2 = new VipCustomer("Bob","Bob@mail.ch");
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim","Tim@mail",2000);
        System.out.println(person3.getName());

        //Comment for this lecture:
        //Created constructors for a class with default values,
        //If values are entered in class it works similarly as in python
    }

}
