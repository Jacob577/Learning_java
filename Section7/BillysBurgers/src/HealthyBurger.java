public class HealthyBurger extends BaseBurger{
    public HealthyBurger(boolean meat) {
        super("Brown rye roll", meat);
    }
    public void selectAddOns(boolean lettuce, boolean fries, boolean carrots, boolean tomatoes, boolean apple, boolean orange, boolean drink) {
        super.selectAddOns(6, lettuce, fries, carrots, tomatoes, apple, orange, drink);
    }
    @Override
    public int getPrice() {
        return super.getPrice();
    }
}