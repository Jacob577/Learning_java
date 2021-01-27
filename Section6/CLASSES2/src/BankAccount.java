public class BankAccount {
    private String customerName;
    private String accountNumber;
    private String email;
    private String phoneNumber;
    private int balance;

    public void withdraw(int amount){
        if (amount <= this.balance){
            this.balance -= amount;
        } else {
            System.out.println("Insufficient founds");
        }
    }
    public void deposit(int amount){
        this.balance += amount;
    }
    public void setCustomerName(String name){
        this.customerName = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAccountNumber(String number){
        this.accountNumber = number;
    }
    public void getCustomerInfo(){
        System.out.println("Name: " + this.customerName
        + "Account nr: " + this.accountNumber + "Phone number: " +
                this.phoneNumber + "Balance: " + this.balance + "Balence: "
        + this.balance);
    }
}
