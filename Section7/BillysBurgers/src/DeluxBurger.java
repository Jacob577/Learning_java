public class DeluxBurger extends BaseBurger{
    public DeluxBurger(String breadRoll, boolean meat) {
        super(breadRoll, meat);

    }
    public void selectAddOns() {
        super.selectAddOns(2, false, true, false, false,
                false, false, true);
    }
    @Override
    public int getPrice() {
        return super.getPrice();
    }
}
