public class BaseBurger {
    private String breadRoll;
    private boolean meat = true;
    private int price = 5;
    private boolean lettuce = false;
    private boolean fries = false;
    private boolean carrots = false;
    private boolean tomatoes = false;
    private boolean apple = false;
    private boolean orange = false;
    private boolean drink = false;

    public BaseBurger(String breadRoll,boolean meat) {
        this.meat = meat;
        this.breadRoll = breadRoll;
    }
    public void selectAddOns(int maxItems,boolean lettuce, boolean fries, boolean carrots, boolean tomatoes,
                                    boolean apple, boolean orange, boolean drink){
        int count = 0;
        if (lettuce){
            count+=1;
            this.price += 1;
            System.out.println("Your order contains");
        }
        if (fries){
            count+=1;
            this.price += 2;
        }
        if (carrots){
            count+=1;
            this.price += 1;
        }
        if (tomatoes){
            count+=1;
            this.price += 1;
        }
        if (apple){
            count += 1;
            this.price += 2;
        }
        if (orange){
            count+=1;
            this.price += 1;
        }
        if (count>maxItems){
            System.out.println("Invalid order, you have selected too many extras.");
        } else {
            this.price += count;
            System.out.println("Your order is complete and the price sums up to: " + this.price);
        }
    }
    public int getPrice(){
        return this.price;
    }
}
