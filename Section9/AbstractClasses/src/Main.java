import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> items = new ArrayList<>();
//        for (int i = 0; i<10; i++){
//            items.add(i);
//        }
//        printDoubled(items);
//
//    }
//    private static void printDoubled(ArrayList<Integer> n){
//        for (int i : n){
//            System.out.println(i * 2);
//        }
        FotballPlayer joe = new FotballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FotballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        Team<SoccerPlayer> brokenTeam = new Team<>("This wont work");
        brokenTeam.addPlayer(beckham);
    }
}
