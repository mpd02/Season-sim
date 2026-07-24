public class Main {
    public static void main(String[] args) {
        double winProb=0.544;
        int lossCount=0;
        int winCount=0;
        int i =0;
        for (i=0; i<162; i++){
            if (Math.random() < winProb){
                winCount++;
            } else {
                lossCount++;
            }
        }

        System.out.println( winCount+ "-" + lossCount);
    }
}