

public class VipCustomer {
    private String name;
    private String email;
    private double creditLimit;

    public VipCustomer(){
        this("John Smith", "john@email.com", 999);
    }
    public VipCustomer(String name, String email, double creditLimit){
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }
    public VipCustomer(String name, String email){
        this(name, email,555);
    }
    public VipCustomer(String name){
        this(name,"unknown",333);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
