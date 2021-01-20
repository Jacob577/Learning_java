public class Proj1 {
    public static void main(String[] args) {
        // Keywords and expressions
//        int myInt = 40;
//
//        if (myInt==40){
//            System.out.println("This integer is ok!");
//
//        } else {
//            System.out.println("This integer is not ok!");
//        }

//        int myVariabele = 50;
         //Java is not concerned with spacing or indentation compared to Python

//        int score = 500;
//        boolean gameOver = true;
//        int levelCompleted = 5;
//        int bonus = 100;

//        if (score < 5000 && score > 1000){
//            System.out.println("Your score was 5000");
//        } else {
//            System.out.println(score + " was your score");
//        }

//        if (gameOver == true){
//            int finalScore = score + (levelCompleted + bonus);
//            System.out.println("your final score was "+ finalScore);

            //If variables are created within a codeblock. They will be deleted after
            //codeblock is ran. This can be called scope.

//        boolean gameOver = true;
//        int score = 5000;
//        int levevrCompleted = 8;
//        int bonus = 200;

//    int highScore = calculateScore(score,levevrCompleted,gameOver,bonus);
//        System.out.println("Your final score is: "+ highScore);
        int playerSocre = 50;
        displayPlayerRanking(playerSocre);
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore > 1000){
            return 1;
        } else if (playerScore > 500 && playerScore < 1000){
            return 2;
        } else if (playerScore > 100 && playerScore < 500){
            return 3;
        }
        return 4;
    }
    public static void displayPlayerRanking(int playerScore){
        int ranking = calculateHighScorePosition(playerScore);
        System.out.println("Player high score position ranking is: " + ranking);
    }
}
