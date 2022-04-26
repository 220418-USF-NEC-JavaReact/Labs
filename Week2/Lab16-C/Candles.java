public class Candles {

    //Provide the logic for the problem below
    //The candles array can be any size
    public int candles(int candles[]){
        int maxHeight = 0;
        int tallCount = 0;
        for(int i = 0; i < candles.length; i++) {
            if(candles[i] > maxHeight) {
                tallCount = 1;
                maxHeight = candles[i];
            } else if (candles[i] == maxHeight) {
                tallCount++;
            }
        }
        return tallCount;
    }

}
