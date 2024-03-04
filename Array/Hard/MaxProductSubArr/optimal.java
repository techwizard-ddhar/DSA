public class optimal {
    
    static void MaxProSunArray(int nums[]){

        int maxPro = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;

        for(int i = 0; i < nums.length; i++){

            if(prefix == 0){
                prefix = 1;
            }

            if(suffix == 0){
                suffix = 1;
            }

            prefix *= nums[i];
            suffix *= nums[nums.length-i-1];

            maxPro = Math.max(maxPro, Math.max(prefix, suffix));
        }

        System.out.println(maxPro);
    }

    public static void main(String[] args) {
        int nums[] = {3,2,-1,4,-6,3,-2,6};
        MaxProSunArray(nums);
    }
}
