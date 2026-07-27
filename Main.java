public class Main {
    public static int playSeason(double winProb, int numGames) {
        int winCount = 0; // counter for wins
        for (int i = 0; i < numGames; i++) { // simulate the specified number of games
            if (Math.random() < winProb) { // generate a random number and compare it to the win probability
                winCount++;
            } 
        }
        return winCount;
    } 

    public static void main(String[] args) {
        int runsScored = 778;
        int runsAllowed = 648;
        double winProb = Math.pow (runsScored, 2)/(Math.pow(runsScored, 2) + Math.pow(runsAllowed, 2)); // calculate the win probability based on runs scored and allowed
        int numGames = 162; // number of games in a season
        int numSimulations = 10000; // number of simulations
        int playoffThreshold= 90; // threshold for making the playoffs
        int playoffCount = 0; // counter for the number of times the team makes the playoffs
        int totalWins = 0; // counter for total wins across all simulations
        int[] wonGames = new int [numSimulations]; // array to store the number of wins for each simulation
        
        for (int i = 0; i < numSimulations; i++) {
            wonGames[i] = playSeason(winProb, numGames); // simulate a season and store the number of wins
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
        if (wonGames[i] >= playoffThreshold) {
            playoffCount++; // increment the playoff count if the number of wins meets or exceeds the threshold
        }
    }
       
    
        double averageWins = (double) totalWins / numSimulations; // calculate the average number of wins
        double playoffProbability = (double) playoffCount / numSimulations * 100; // calculate the probability of making the playoffs
        System.out.printf("Average wins: %.2f\n", averageWins); // print the average number of wins across all simulations
        System.out.printf("Max wins: %d\n", maxWins); // print the maximum number of wins across all simulations
        System.out.printf("Min wins: %d\n", minWins); // print the minimum number of wins across all simulations
        System.out.printf("Playoff probability: %.2f%%\n", playoffProbability); // print the probability of making the playoffs
    }

}