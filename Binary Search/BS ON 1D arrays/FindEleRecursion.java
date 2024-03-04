public class FindEleRecursion {
    
    static int FindElement(int nums[], int low, int high, int key) {
        if (low > high){
            return -1;
        }
        
        int mid = low + (high - low)/2;

        if(nums[mid] == key){
            return mid;
        }
        else if(key < nums[mid]){
            return FindElement(nums, low, mid-1, key);
        }
        else{
            return FindElement(nums, mid+1, high, key);
        }
    }
    

    public static void main(String[] args) {
        int nums[] = {3, 6, 8, 12, 14, 17, 25, 29, 31, 36, 42, 47, 53, 55, 62};
        
        int high = nums.length-1;

        int key = 36;

        int res = FindElement(nums, 0, high, key);

        System.out.println(res);
    }
}

