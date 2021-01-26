import java.sql.Struct;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        if (age <= 0 || age > 100){
            this.age = 0;
        } else{
            this.age = age;
        }
    }
    public boolean isTeen(){
        if (this.age>= 13 && this.age <=19){
            return true;
        }else{
            return false;
        }
    }
    public String getFullName(){
        if (this.firstName != null && this.lastName != null){
            System.out.println("here1");
            return (this.firstName + " " + this.lastName);
        } else if (this.firstName != null){
            System.out.println("here");
            return this.firstName;
        }
            return (this.firstName);

    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }
}
