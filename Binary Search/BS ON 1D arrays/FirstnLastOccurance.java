public class FirstnLastOccurance {
    
    static int FirstOccurance(int nums[], int target){

        int n = nums.length;
        int low = 0;
        int high = n-1;
        int first = -1;

        while(low <= high){
            int mid = (low+high)/2;

            if(target == nums[mid]){
                first = mid;
                high = mid-1;
            }

            else if(target < nums[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return first;
    }

    static int LastOccurance(int nums[], int target){

        int n = nums.length;
        int low = 0;
        int high = n-1;
        int last = -1;

        while(low <= high){
            int mid = (low+high)/2;

            if(target == nums[mid]){
                last = mid;
                low = mid+1;
            }

            else if(target < nums[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return last;
    }

    static int[] firstAndLastPosition(int nums[], int target){
        int first = FirstOccurance(nums, target);
        if (first == -1) return new int[] { -1, -1};
        int last = LastOccurance(nums, target);
        return new int[] {first, last};

    }

    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;

        int res[] = firstAndLastPosition(nums, target);

        for(int ele:res){
            System.out.print(ele + " ");
        }
    }

}
