/*public class TwoSum {
    
    static boolean FindSum(int nums[], int k){

        for(int i = 0; i < nums.length; i++){

            for(int j = i+1; j < nums.length; j++){

                if(nums[i] + nums[j] == k){
                    return true;
                }
            }
        }

        return false;
    } 

    public static void main(String[] args) {
        
        int nums[] = {2,6,5,8,11};

        int k = 15;

        System.out.println(FindSum(nums, k));
    }
}*/

import java.util.HashMap;

public class TwoSum 
{
    
    static int[] FindSum(int nums[], int k)
    {

        int res[] = new int[2];
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {

            int previous = k - nums[i];

            if(hs.containsKey(previous))
            {
                res[0] = hs.get(previous);
                res[1] = i;
            }

            hs.put(nums[i], i);
        }
        
        return res;
    
    }

    public static void main(String[] args) {
        int nums[] = {2,7,11,15};

        int target = 13;

        int ans[] = FindSum(nums, target);

        for(int x:ans){
            System.out.print(x + " ");
        }

    }

}

