public class CountSubarray {
    
    static int noOfSunarray(int nums[], int k){

        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];

                if(sum == k){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        
        int nums[] = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;

        int res = noOfSunarray(nums, k);
        System.out.println(res);
    }
}
