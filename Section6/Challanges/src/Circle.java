public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius>=0){
            this.radius = radius;
        } else {
            this.radius = 0;
        }

    }

    public double getArea(){
        double area = radius*radius*Math.PI;
        return area;
    }

    public double getRadius() {
        return radius;
    }
}
