public class Calculator {
    Floor floor;
    Carpet carpet;

    public double getTotalCost(){
        return floor.getArea()* carpet.getCost();
    }
}
