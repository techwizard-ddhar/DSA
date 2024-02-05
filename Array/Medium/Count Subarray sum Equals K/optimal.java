import java.util.HashMap;

public class optimal {
    
    static int noOfSunarray(int nums[], int k){

        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i < nums.length; i++){

            sum += nums[i];

            if(sum == k){
                count++;
            }

            int contain = sum - k;
            if(hs.containsKey(contain)){
                count += hs.get(contain);
            }

            hs.put(sum, hs.getOrDefault(sum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args)
    {

        int nums[] = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;

        int res = noOfSunarray(nums, k);
        System.out.println(res);
    }
}
