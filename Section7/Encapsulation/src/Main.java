class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "no plot here";
    }

    public String getName() {
        return name;
    }
}
class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "Sharks eat a lot of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence day");
    }

    @Override
    public String plot() {
        return "Aliens attempts to take over planet earth";
    }
}
class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze";
    }
}
class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Galactic warfare";
    }
}
class Forgetable extends Movie {
    public Forgetable(){
        super("Forgetable");
    }
    //No plot method
}

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+ player.healthRemaining());
//
//        damage = 21;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = "+ player.healthRemaining());
//        EnhancedPlayer player = new EnhancedPlayer("tim", 2150, "Sword");
//        System.out.println("initial health is "+player.getHitPoints());

//        Printer printer = new Printer(20,true,50);
//        printer.fillPrinter(80);
//        printer.print();
        for (int i = 1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");

        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new StarWars();
            case 4:
                return new Forgetable();
            case 5:
                return new MazeRunner();
        }
        return null;
    }
}
