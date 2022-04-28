public class Candles {

    //Provide the logic for the problem below
    //The candles array can be any size
    public int candles(int candles[]){
        int tallest = 0;
        int temp = candles[0];
        int counter = 0;

        for (int i = 0; i < candles.length; i++) {
            if (candles[i] > temp) {
                temp = candles[i];
            }
        }

        for (int k = 0; k < candles.length; k++) {
            if(temp == candles[k]) {
                counter++;
            }
        }

        tallest = counter;

        return tallest;
    }

}
