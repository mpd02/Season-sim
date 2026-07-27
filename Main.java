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
        int numSimulations = 10000; // number of simulations
        int totalWins = 0; // counter for total wins across all simulations
        int[] wonGames = new int [numSimulations]; // array to store the number of wins for each simulation
        
        for (int i = 0; i < numSimulations; i++) {
            wonGames[i] = playSeason(); // simulate a season and store the number of wins
        }
        int maxWins = wonGames[0]; // variable to track the maximum number of wins
        int minWins = wonGames[0]; // variable to track the minimum number of wins
        for (int i = 0; i < numSimulations; i++) {
            totalWins += wonGames[i]; // sum up the total wins across all simulations
            if (maxWins < wonGames[i]){
            maxWins = wonGames[i]; // update maxWins if the current simulation has more wins
        }
        if (minWins > wonGames[i]){
            minWins = wonGames[i]; // update minWins if the current simulation has fewer wins
        }
        }
        double averageWins = (double) totalWins / numSimulations; // calculate the average number of wins
        int wins = wonGames[0]; // get the number of wins from the first simulation
        int losses = 162 - wins;
        System.out.println(wins + "-" + losses); // print the number of wins and losses
        System.out.println("Average wins: " + averageWins); // print the average number of wins across all simulations
        System.out.println("Max wins: " + maxWins); // print the maximum number of wins across all simulations
        System.out.println("Min wins: " + minWins); // print the minimum number of
    }

}