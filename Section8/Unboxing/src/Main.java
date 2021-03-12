import java.util.ArrayList;

//class IntClass{
//    private int myValue;
//
//    public IntClass(int myValue){
//        this.myValue = myValue;
//    }
//
//    public int getMyValue() {
//        return myValue;
//    }
//
//    public void setMyValue(int myValue) {
//        this.myValue = myValue;
//    }
//}

public class Main {
    private static Bank bank;
    private static Customer customer;
    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");
        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Bob",150.54);

        bank.addCustomerTransaction("Adelaide","Tim", 44.22);
        bank.addCustomerTransaction("Adelaide","Tim", 12.44);
        bank.addCustomerTransaction("Adelaide","Mike", 44.22);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);


//        bank.addBranch();
//        bank.addCustomer(0, "Jonathan");


//        String[] strArray = new String[10];
//        int[] intArray = new int[10];
//
//        ArrayList<String> strArrayList = new ArrayList<>();
//        strArrayList.add("Tim");
//
//        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
//        intClassArrayList.add(new IntClass(54));
//
//        Integer integer = new Integer(54);
//        Double doubleValue = new Double(12.54);
//
//        ArrayList<Integer> intArrayList = new ArrayList<>();

//        for (int i = 0; i<10; i++){
//            intArrayList.add(Integer.valueOf(i));
//        }
//        for (int i = 0; i<10; i++){
//            System.out.println(i + " --> " + intArrayList.get(i).intValue());
//        }

//        Integer myIntValue = Integer.valueOf(56);
//        int myInt = myIntValue;
//
//        ArrayList<Double> myDoubleValues = new ArrayList<>();
//        for (double dbl = 0.0; dbl<=10.0; dbl += 0.5){
//            myDoubleValues.add(dbl);
//        }
//        for (int i = 0; i<myDoubleValues.size(); i++){
//            double value = myDoubleValues.get(i);
//            System.out.println(i + " --> " + value);
//        }

    }
}
