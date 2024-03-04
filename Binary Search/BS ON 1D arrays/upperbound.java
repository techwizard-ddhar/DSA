public class upperbound {
    
    static int UpperBound(int nums[], int x, int n){

        int low = 0;
        int high = n-1;
        int ans = n;

        while(low <= high){

            int mid = (low+high)/2;

            if(x < nums[mid]){
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
        int nums[] = {2,3,6,7,8,8,11,11,11,12};
        int x = 9;
        int n = nums.length;

        int res = UpperBound(nums, x, n);

        System.out.println(res);
    }
}