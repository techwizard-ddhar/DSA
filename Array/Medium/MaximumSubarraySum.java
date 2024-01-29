/*public class MaximumSubarraySum {
    
    static int maxSubarray(int nums[]){

        int maxSum = 0;
        for(int i = 0; i < nums.length; i++){
            
            for(int j = i; j < nums.length; j++){

                int sum = 0;

                for(int k = i; k <= j; k++){

                    sum += nums[k];
                }

                maxSum = Math.max(maxSum, sum); //Time Complexity --> O(n^3), Space Complexity --> O(1)
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};

        int res = maxSubarray(nums);

        System.out.println(res);
    }
}*/

/*public class MaximumSubarraySum {
    
    static int maxSubarray(int nums[]){

        int maxSum = 0;
        for(int i = 0; i < nums.length; i++){
            
            int sum = 0;

            for(int j = i; j < nums.length; j++){
                
                sum += nums[j];
                
                maxSum = Math.max(maxSum, sum); //Time Complexity --> O(n^2), Space Complexity --> O(1)
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        
        int nums[] = {1, 2, 7, -4, 3, 2, -10, 9, 1};

        int res = maxSubarray(nums);

        System.out.println(res);
    }
}*/

/*public class MaximumSubarraySum {
    
    static int maxSubarray(int nums[]){

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){

            sum += nums[i];

            if(sum > maxSum){
                maxSum = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        return maxSum; // Time Complexity --> O(n), Space Complexity --> O(1)
    }

    public static void main(String[] args) {
        
        int nums[] = {1, 2, 7, -4, 3, 2, -10, 9, 1};

        int res = maxSubarray(nums);

        System.out.println(res);
    }
}*/

public class MaximumSubarraySum {
    
    static void maxSubarray(int nums[]){

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int start = 0;
        int ansStart = -1;
        int ansEnd = -1;
        for(int i = 0; i < nums.length; i++){

            if(sum == 0){
                start = i;
            }
            sum += nums[i];

            if(sum > maxSum){
                maxSum = sum;
                ansStart = start;
                ansEnd = i;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        for(int i = ansStart; i <= ansEnd; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        int nums[] = {1, 2, 7, -4, 3, 2, -10, 9, 1};

        maxSubarray(nums);
    }
}

