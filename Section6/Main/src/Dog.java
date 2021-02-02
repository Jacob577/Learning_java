public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name,  int size, int weight,int eyes, int legs,int tail,int teeth,String coat) {
        super(name, 1, size, 1, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("dog.eat called");
        chew();
        super.eat();
    }


    public void walk (){
        super.move(5);
        System.out.println("Dog.walk called");
    }

    public void moveLegs(int speed){
        System.out.println("Dog.moveLegs called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move called (overidden method)");
        super.move(speed);
    }

    public void run(){
        super.move(10);
        System.out.println("Dog.run called");
    }


    private void chew(){
        System.out.println("dog.chew called");
    }
}
//I  tried to write some code but it didn't turn out well, I was to tired to understand what I was doing.
//Did an effort to do a little bit of coding but ended up watching videos to understand further how inheritance work.
//Also static. static for variables should be used as what I would call a global variable within methods
//across obejcts. static methods should be used whenever there is no input variables to the method.
//Super is used instead of using this when refering to a method from main class in extended methods.
