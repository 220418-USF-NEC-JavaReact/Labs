public class Candles {

    //Provide the logic for the problem below
    //The candles array can be any size
    public int candles(int candles[]){
        int tallest = 0;
        int maxCount = 0;
        for(int i = 0; i < candles.length; i++){
            if (tallest < candles[i]){
                tallest = candles[i];
                maxCount = 1;
            } else if (tallest == candles[i]){
                maxCount++;
            }
        }
        return maxCount;
    }

}
