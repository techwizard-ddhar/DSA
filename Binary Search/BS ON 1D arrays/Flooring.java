public class Flooring {
    
    static int Floor(int nums[], int x, int n){

        int low = 0;
        int high = n-1;
        int index = -1;

        while(low <= high){

            int mid = (low+high)/2;

            if(nums[mid] <= x){
                index = nums[mid];
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int nums[] = {3,4,4,7,8,10};
        int x = 25;
        int n = nums.length;

        int res = Floor(nums, x, n);

        System.out.println(res);
    }
}
