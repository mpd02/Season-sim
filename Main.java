public class Main {
    public static int playSeason() {
        double winProb = 0.544; // probability of winning a single game
        int winCount = 0; // counter for wins
        for (int i = 0; i < 162; i++) { // simulate 162 games
            if (Math.random() < winProb) { // generate a random number and compare it to the win probability
                winCount++;
            } 
        }
        return winCount;
    }

    public static void main(String[] args) {
        int wins = playSeason();
        int losses = 162 - wins;
        System.out.println(wins + "-" + losses); // print the number of wins and losses
    }
}