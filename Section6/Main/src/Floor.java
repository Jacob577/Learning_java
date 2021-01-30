public class Floor {
    private double width;
    private double length;

    public Floor(){
        this(0,0);
    }
    public Floor(double width,double length){
        if (width < 0){
            this.width = 0;
        }
        if (length < 0){
            this.length = 0;
        }
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        return this.length*this.width;
    }
}
