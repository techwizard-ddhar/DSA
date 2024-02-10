public class BruteForce {
    
    static void FindXor(int nums[], int target){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                int xor  = 0;
                for(int k = i; k <= j; k++)  //Time complexity --> O(n^3)
                {
                    xor = xor ^ nums[k];

                }
                if(xor == target)
                {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        int nums[] = {5, 6, 7, 8, 9};
        int target = 5;
        FindXor(nums, target);
    }
}
