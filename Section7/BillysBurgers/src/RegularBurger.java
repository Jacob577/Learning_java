public class RegularBurger extends BaseBurger{
    public RegularBurger(String breadRoll, boolean meat) {
        super(breadRoll, meat);
    }

    public void selectAddOns(boolean lettuce, boolean fries, boolean carrots, boolean tomatoes, boolean apple, boolean orange, boolean drink) {
        super.selectAddOns(4, lettuce, fries, carrots, tomatoes, apple, orange, drink);
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
