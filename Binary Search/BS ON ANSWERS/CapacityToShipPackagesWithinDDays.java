public class CapacityToShipPackagesWithinDDays {
    
    static int minDays(int weights[], int capacity){
        int day = 1;
        int load = 0;

        for(int i = 0; i < weights.length; i++){
            if(load + weights[i] <= capacity){
                load += weights[i];
            }
            else{
                day = day + 1;
                load = weights[i];
            }
        }

        return day;
    }

    static int leastweightcapacity(int weights[], int days){

        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < weights.length; i++){
            sum += weights[i];
            maxi = Math.max(maxi, weights[i]);
        }

        int low = maxi;
        int high = sum;
        // for(int i = maxi; i <= sum; i++){
        //     int reqDays = minDays(weights, i);
        //     if(reqDays <= days){
        //         return i;
        //     }
        // }

        // return -1;
        while(low <= high){
            int mid = (low + high)/2;
            int reqDays = minDays(weights, mid);
            if(reqDays <= days){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        int weights[] = {5, 4, 5, 2, 3, 4, 5, 6};
        int days = 5;
        int ans = leastweightcapacity(weights, days);
        System.out.println("The minimum capacity should be: " + ans);
    }
}
