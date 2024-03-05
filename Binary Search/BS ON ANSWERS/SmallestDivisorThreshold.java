public class SmallestDivisorThreshold {

    static int smallestDivisor(int nums[], int limit){

        int sumOfDivisor = 0;
        for(int i = 0; i < nums.length; i++){
            sumOfDivisor += Math.ceil((double)nums[i] / (double)limit);
        }

        return sumOfDivisor;
    }
    
    static int FindDivisor(int nums[], int threshold){

        if(nums.length > threshold){
            return -1;
        }

        //int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            //mini = Math.min(mini, nums[i]);
            maxi = Math.max(maxi, nums[i]);
        }

        //Time complexity -> O(max(nums[])-min(nums[])+1 * N)

        // for(int i = mini; i <= maxi; i++){
        //     int totalD = smallestDivisor(nums, i);
        //     if(totalD <= threshold){
        //         return i;
        //     }

        // }

        // return -1;

        //Time complexity -> O(log(max(nums[])-min(nums[])+1) * N)
        int low = 1;
        int high = maxi;
        while(low <= high){
            int mid = (low + high)/2;
            int totalD = smallestDivisor(nums, mid);
            if(totalD <= threshold){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        
        int nums[] = {21212,10101,12121};
        int threshold = 1000000;       
        int ans = FindDivisor(nums, threshold);
        System.out.println("The minimum divisor is: " + ans);
    }
    
}
