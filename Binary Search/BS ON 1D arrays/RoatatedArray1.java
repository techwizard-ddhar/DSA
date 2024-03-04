public class RoatatedArray1 {
    
    static int FindElement(int nums[], int n, int target){
        
        int low = 0;
        int high = n-1;
    
        while(low <= high){
            int mid = (low+high)/2;

            if(target == nums[mid]){
                return mid;
            }
            
            if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target <= nums[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {7, 8, 9, 1, 2, 3, 4, 5, 6};
    
        int n = nums.length;
    
        int target = 1;
    
        int res = FindElement(nums, n, target);
    
        System.out.println(res);
    }
}
    

