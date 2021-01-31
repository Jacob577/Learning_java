public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int body, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, body, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void rest(){

    }
    private void swim(int speed){
        moveBackfin();
        moveMuscles();
        super.move(speed);

    }
    private void moveMuscles(){

    }
    private void moveBackfin(){

    }
}
