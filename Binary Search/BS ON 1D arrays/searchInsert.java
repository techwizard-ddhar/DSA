public class searchInsert {

    static int Search(int nums[], int x, int n){

        int low = 0;
        int high = n-1;
        int ans = n;

        while(low <= high){

            int mid = (low+high)/2;

            if(x <= nums[mid]){
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
        int nums[] = {1, 2, 4, 7};
        int x = 8;
        int n = nums.length;

        int res = Search(nums, x, n);

        System.out.println(res);
    }
}
