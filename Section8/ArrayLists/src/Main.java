import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean running = true;
        int chice = 0;
        while (running)
        {

        }

//        boolean quit = false;
//        int choice = 0;
//        printInstructions();
//        while (!quit){
//            System.out.println("Enter your choice: ");
//            choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice){
//                case 0:
//                printInstructions();
//                case 1:
//                    groceryList.printGroceryList();
//                    break;
//                case 2:
//                    addItem();
//                    break;
//                case 3:
//                    modifyItem();
//                case 4:
//                    removeItem();
//                    break;
//                case 5:
//                    searchForItem();
//                    break;
//                case 6:
//                    quit = true;
//                    break;
//
//            }
//        }
    }
    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - Print chice options");
        System.out.println("\t 1 - print contact list");
        System.out.println("\t 2 - Add contact");
        System.out.println("\t 3 - modify contacts");
        System.out.println("\t 4 - remove contact from contact list");
        System.out.println("\t 5 - search for contact");
        System.out.println("\t 6 - quit application");
    }
    public void addContact(){
        System.out.println("What is the name of your new contact?");
        String name = scanner.nextLine();
        System.out.println("What is the number of your new contact?");
        String number = scanner.nextLine();
        mobilePhone.addContact(name,number);

    }
    public void modifyContactList(){
        mobilePhone.printPhoneList();
        System.out.println("What is the position of the contact you want to modify?");
        int position = scanner.nextInt();
        System.out.println("Enter the new name please.");
        String name = scanner.nextLine();
        System.out.println("Enter the new phone number please");
        String number = scanner.nextLine();

        mobilePhone.modifyPhoneList(position,name, number);
    }

//    public static void addItem(){
//        System.out.println("Please enter the grocery item: ");
//        groceryList.addGroceryItem(scanner.nextLine());
//    }
//    public static void modifyItem(){
//        System.out.print("Enter item number: ");
//        int itemNo = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Enter replacement item: ");
//        String newItem = scanner.nextLine();
//        groceryList.modifyGroceryItem(itemNo - 1, newItem);
//    }
//    public static void removeItem(){
//        System.out.print("Enter item number: ");
//        int itemNo = scanner.nextInt();
//        scanner.nextLine();
//        groceryList.removeGroceryItem(itemNo-1);
//    }
//    public static void searchForItem(){
//        System.out.println("Item to search for: ");
//        String searchItem = scanner.nextLine();
//        if (groceryList.findItem(searchItem) != null){
//            System.out.println("Found " + searchItem + " in our grocery list.");
//        } else {
//            System.out.println(searchItem + " is not in the grocery list!");
//        }
//    }
}
