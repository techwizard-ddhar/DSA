// public class KoKoEatingBananas {
       
       //Time complexity -> O(max[arr]xO(N))

//     static int maxHours(int piles[]){
//         int maxi = Integer.MIN_VALUE;
//         for(int i = 0; i < piles.length; i++){
//             if(maxi < piles[i]){
//                 maxi = piles[i];
//             }
//         }

//         return maxi;
        
//     }

//     static int NoOfBananasPerHour(int piles[], int hours){

//         int totalH = 0;
//         for(int i = 0; i < piles.length; i++){
//             totalH += Math.ceil((double)piles[i] / (double)hours);
//         }
        
//         return totalH;
//     }
    
//     static int NoOfHours(int piles[], int h){
//         int maxTime = maxHours(piles);
        
//         for(int i = 1; i <= maxTime; i++){
//             int reqTime = NoOfBananasPerHour(piles, i);
//             if(reqTime <= h){
//                 return i;
//             } 
//         }

//         return maxTime;
//     }

//     public static void main(String[] args) {
        
//         int piles[] = {25, 12, 8, 14, 19};

//         int h = 5;

//         int ans = NoOfHours(piles, h);

//         System.out.println("Koko should eat at least " + ans + " bananas/hr.");
//     }
// }


public class KoKoEatingBananas {
    
    //Time complexity -> O(N * log(max(piles)))

    static int maxHours(int piles[]){
        int maxi = piles[0];
        for(int i = 1; i < piles.length; i++){
            if(maxi < piles[i]){
                maxi = piles[i];
            }
        }

        return maxi;
        
    }

    static int NoOfBananasPerHour(int piles[], int hours){
        int totalH = 0;
        for(int i = 0; i < piles.length; i++){
            totalH += Math.ceil((double)piles[i] / (double)hours);
        }
        return totalH;
    }

    static int minEatingSpeed(int piles[], int h){
        int low = 1;
        int high = maxHours(piles);

        while(low <= high){
            int mid = (low + high)/2;
            int reqTime = NoOfBananasPerHour(piles, mid);
        
            if(reqTime <= h){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        
        int piles[] = {3, 6, 7, 11};

        int h = 8;

        int ans = minEatingSpeed(piles, h);

        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
}
