public class NoOfTimesArrayRotated {

    static int Minimum(int nums[]){

        int low = 0;
        int high = nums.length - 1;
        int Mini = Integer.MAX_VALUE;
        int index = -1;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[low] <= nums[high]){
                if(nums[low] < Mini){
                    index = low;
                    Mini = nums[low];
                }

                break;
            }
            
            if(nums[low] <= nums[mid]){
                if(nums[low] < Mini){
                    index = low;
                    Mini = nums[low];
                }

                low = mid + 1;
            }

            else{

                if(nums[mid] < Mini){
                    index = mid;
                    Mini = nums[mid];
                }

                high = mid - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        
        int nums[] = {4, 5, 6, 7, 0, 1, 2, 3};

        int res = Minimum(nums);

        System.out.println("The array is rotated " + res + " times.");
    }
}
