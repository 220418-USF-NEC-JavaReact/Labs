public class Candles {

    //Provide the logic for the problem below
    //The candles array can be any size
    public int candles(int candles[]){
        int max = 0;
        int instancesOfMax = 0;


        for(int i = 0; i<candles.length; i++) {
            if(candles[i] > max) {
                max = candles[i];
            }
        }

        for(int i = 0; i<candles.length; i++) {
            if (candles[i] == max) {
                instancesOfMax += 1;
            }
        }

        return instancesOfMax;
    }

}
