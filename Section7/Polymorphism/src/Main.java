class Car {
    private int cylinders;
    private boolean engine = true;
    private int wheels = 4;

    public Car(int cylinders, boolean engine, int wheels) {
        this.cylinders = cylinders;
        this.engine = engine;
        this.wheels = wheels;
    }

    public void startEngine(){
        System.out.println("car--> The engine is now on");
    }

    public void accelerate(){
        System.out.println("car --> The car is now accelerating");
    }

    public void brake(){
        System.out.println("car --> The car is now breaking");
    }
    public void showAll(){
        startEngine();
        accelerate();
        brake();
    }

    public int getCylinders() {
        return cylinders;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }
}

class Honday extends Car{
    public Honday() {
        super(6, true, 4);
    }

    @Override
    public void startEngine() {
        System.out.println("Honday--> The engine is now on");
    }

    @Override
    public void accelerate() {
        System.out.println("Honday --> The car is now accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Honday --> The car is now breaking");
    }
}
class Bicycle extends Car {
    public Bicycle() {
        super(0, false, 2);
    }

    @Override
    public void startEngine() {
        System.out.println("Bicycle--> You are starting to paddel");
    }

    @Override
    public void accelerate() {
        System.out.println("Bicycle --> The car is now accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Bicycle --> You are now slowing down");
    }
}
class Cat extends Car{
    public Cat() {
        super(12, true, 8);
        canDig();

    }
    private void canDig(){
        System.out.println("This is an industrial machine that can dig!");
    }

    public Cat(int cylinders, boolean engine, int wheels) {
        super(cylinders, engine, wheels);
    }

    @Override
    public void brake() {
        System.out.println("Cat --> This industrial monster cannot stop.");
    }

    @Override
    public void startEngine() {
        System.out.println("Cat --> This industrial monster goes BRUM BRUM!!");
    }

    @Override
    public void accelerate() {
        System.out.println("Cat --> This industrial machine is low to accelirate");
    }
}
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i<4; i++){
            getAll(i);
        }
    }
    public static void getAll(int number){
        switch (number){
            case 1:
                new Honday().showAll();
                break;
            case 2:
                new Cat().showAll();
                break;
            case 3:
                new Bicycle().showAll();
                break;
            default:
                System.out.println("No show here");

        }
    }
}









