// public class MinInRotatedArray {
//     static int Minimum(int nums[]){

//         int min = nums[0];
//         for(int i = 1; i < nums.length; i++){
//             if(min > nums[i]){
//                 min = nums[i];
//             }
//         }

//         return min;
//     }

//     public static void main(String[] args) {
        
//         int nums[] = {4,5,6,7,0,1,2,3};

//         int res = Minimum(nums);

//         System.out.println("The minimum element is: " + res);
//     }
// }

public class MinInRotatedArray {
    static int Minimum(int nums[]){

        int low = 0;
        int high = nums.length - 1;
        int Mini = Integer.MAX_VALUE;

        while(low <= high){
            int mid = (low + high)/2;

            if(nums[low] <= nums[high]){
                Mini = Math.min(Mini, nums[low]);
            }
            
            if(nums[low] <= nums[mid]){
                Mini = Math.min(Mini, nums[low]);

                low = mid + 1;
            }

            else{

                Mini = Math.min(Mini, nums[mid]);

                high = mid - 1;
            }
        }

        return Mini;
    }

    public static void main(String[] args) {
        
        int nums[] ={4,5,6,7,0,1,2,3};

        int res = Minimum(nums);

        System.out.println("The minimum element is: " + res);
    }
}


