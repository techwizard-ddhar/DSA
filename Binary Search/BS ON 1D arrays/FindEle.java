//Iterative search

public class FindEle {
    
    static int FindElement(int nums[], int n, int key){

        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(key == nums[mid]){
                return mid;
            }

            if(key < nums[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {3, 6, 8, 12, 14, 17, 25, 29, 31, 36, 42, 47, 53, 55, 62};

        int n = nums.length;

        int key = 29;

        int res = FindElement(nums, n, key);

        System.out.println(res);
    }
}
