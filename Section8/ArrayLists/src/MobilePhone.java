import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<String> nameList = new ArrayList<>();
    private ArrayList<String> teleohoneNumber = new ArrayList<>();

    public void addContact(String name, String number){
        nameList.add(name);
        teleohoneNumber.add(number);
    }
    public void printPhoneList(){
        System.out.println("You have " + nameList.size() + " number of contacts");
        for (int i = 0; i<nameList.size(); i ++){
            System.out.println(i+1 + ". " + nameList.get(i) + " " + teleohoneNumber.get(i));
        }
    }
    public void modifyPhoneList(int position, String name, String number){
        position --;
        teleohoneNumber.set(position,number);
        nameList.set(position,name);
        position++;
        System.out.println("you changed " + position + " to something else!");
    }
    public void removeContact(int position){
        position--;
        System.out.println("You removed " + nameList.get(position) + " From your contact list");
        teleohoneNumber.remove(position);
        nameList.remove(position);
    }
    public void findContact(String name){
        int position = nameList.indexOf(name);
        if (position>=0){
            System.out.println(nameList.get(position) + " " + teleohoneNumber.get(position));
        } else {
            System.out.println("Sorry, contact not found");
        }
    }
}
