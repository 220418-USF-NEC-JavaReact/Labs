public class Race {

    public String twoKidsAndATruck(int k1, int k2, int t) {
        boolean kidOne = t > k1;
        boolean kid1 = t < k1;
        boolean kidTwo = t > k2;
        boolean kid2 = t < k2;
        boolean truckOne = t == k1;
        boolean truckTwo = t == k2;
        byte choice = 0;
        String result;
        if(kidOne){
            k1 = t - k1;
            if(kidTwo){ 
                k2 = t - k2;
                if(k1 == k2){
                }else if(k1 > k2){
                    choice = 2;}else if(k1 < k2){
                        choice = 1;
                    }
        }else if(kid2){
            k2 -= t;
            if(k1 == k2){
            }else if(k1 > k2){
                choice = 2;}else if(k1 < k2){
                    choice = 1;
                }
        }
    }else if(kid1){
        k1 -= t;
        if(kidTwo){ 
            k2 = t - k2;
            if(k1 == k2){
            }else if(k1 > k2){
                choice = 2;}else if(k1 < k2){
                    choice = 1;
                }
    }else if(kid2){
        k2 -= t;
        if(k1 == k2){
        }else if(k1 > k2){
            choice = 2;}else if(k1 < k2){
                choice = 1;
            }
    }
}else if(truckOne){
    choice = 1;
}else if(truckTwo){
    choice = 2;
}else if(k1 == k2){}
    switch(choice) {
        case 0 : result = "Truck";
            break;
        case 1 : result = "Kid 1";
            break;
        case 2 : result = "Kid 2";
            break;
        default : result = "Fault";
    }
    return result;
}
}
