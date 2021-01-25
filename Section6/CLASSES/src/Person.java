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
        
        return (this.firstName + "" + this.lastName);
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
