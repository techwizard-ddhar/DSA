// public class LowerBound {
    
//     static int lowerbound(int nums[], int x){

//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] >= x){
//                 return i;
//             }
//         }

//         return nums.length;
//     }

//     public static void main(String[] args) {
//         int nums[] = {3, 5, 8, 15, 19};
//         int x = 17;

//         int res = lowerbound(nums, x);

//         System.out.println(res);
//     }
// }


public class LowerBound {
    
    static int lowerbound(int nums[], int x, int n){

        int low = 0;
        int high = n-1;
        int ans = n;

        while(low <= high){

            int mid = (low+high)/2;

            if(nums[mid] >= x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int nums[] = {3, 5, 8, 15, 19};
        int x = 6;
        int n = nums.length;

        int res = lowerbound(nums, x, n);

        System.out.println(res);
    }
}