import java.util.*;

public class BruteForece {
    
    static void ThreeSum(int nums[]){

        HashSet<List<Integer>> list = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                for(int k = j+1; k < nums.length; k++) //Time complexity-->O(n^3)
                { 
                    if(nums[i]+nums[j]+nums[k] == 0)
                    {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        temp.sort(null);
                        list.add(temp);
                    }

                }
                
            }
        }

        System.out.println(list);

    }

    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        ThreeSum(nums);
    }
}
