// public class MinDaysToMakeMBouquets {
    
//     static boolean possible(int bloomDay[], int days, int k, int m){
//         int NoOfFlowers = 0;
//         int NoOfBouquets = 0;

//         for(int i = 0; i < bloomDay.length; i++){
//             if(bloomDay[i] <= days){
//                 NoOfFlowers++;
//             }
//             else{
//                 NoOfBouquets += (NoOfFlowers/k);
//                 NoOfFlowers = 0;
//             }
//         }
//         //remaining bloomDay
//         NoOfBouquets += (NoOfFlowers/k);
//         return NoOfBouquets >= m;

//     }

//     static int roseGarden(int bloomDay[], int k, int m){

//         int mini = Integer.MAX_VALUE;
//         int maxi = Integer.MIN_VALUE;

//         for(int i = 0; i < bloomDay.length; i++){
//             mini = Math.min(mini, bloomDay[i]);
//             maxi = Math.max(maxi, bloomDay[i]);
//         }

//         for(int i = mini; i <= maxi; i++){
//             if(possible(bloomDay, i, k, m)){
//                 return i;
//             }
//         }

//         return -1;
//     }

//     public static void main(String[] args) {
        
//         int bloomDay[] = {7, 7, 7, 7, 13, 11, 12, 7};
//         int k = 3;
//         int m = 2;

//         int ans = roseGarden(bloomDay, k, m);

//         if (ans == -1)
//             System.out.println("We cannot make m bouquets.");
//         else
//             System.out.println("We can make bouquets on day " + ans);
//     }
// }


public class MinDaysToMakeMBouquets {
    
    static boolean possible(int bloomDay[], int days, int m, int k){
        int NoOfFlowers = 0;
        int NoOfBouquets = 0;

        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= days){
                NoOfFlowers++;
            }
            else{
                NoOfBouquets += (NoOfFlowers/k);
                NoOfFlowers = 0;
            }
        }
        //remaining bloomDay
        NoOfBouquets += (NoOfFlowers/k);
        return NoOfBouquets >= m;

    }

    static int roseGarden(int bloomDay[], int m, int k){

        if(m*k > bloomDay.length){
            return -1;
        }
        
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i < bloomDay.length; i++){
            mini = Math.min(mini, bloomDay[i]);
            maxi = Math.max(maxi, bloomDay[i]);
        }

        int low = mini;
        int high = maxi;

        while(low <= high){
            int mid = (low + high)/2;
            if(possible(bloomDay, mid, m, k)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        
        int bloomDay[] = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;

        int ans = roseGarden(bloomDay, m, k);

        System.out.println("We can make bouquets on day " + ans);
    }
}
