public class Main {
    public static void main(String[] args) {
        RegularBurger regularBurger = new RegularBurger("White",true);
        regularBurger.selectAddOns(true,true,true,true,
                false,true,true);
        DeluxBurger deluxBurger = new DeluxBurger("Rye",true);
        deluxBurger.selectAddOns();
        deluxBurger.getPrice();

    }
}
