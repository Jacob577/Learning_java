public class Carpet {
    private double cost;

    public Carpet(double cost){
        this.cost = cost;
    }
    public Carpet(){
        this(0);
    }
    public double getCost(){
        return this.cost;
    }
}
