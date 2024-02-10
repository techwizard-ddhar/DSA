import java.util.*;

public class Better
{
    
    static void ThreeSum(int nums[])
    {

        HashSet<List<Integer>> list = new HashSet<>();//storing all triplets
        

        for(int i = 0; i < nums.length; i++)
        {
            HashSet<Integer> hs = new HashSet<>();

            for(int j = i+1; j < nums.length; j++)
            {
                int next = -(nums[i] + nums[j]);
                if(hs.contains(next))
                {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], next);
                    temp.sort(null);
                    list.add(temp);
                }
                hs.add(nums[j]);

            }
                
        }
    

        System.out.println(list);

    }

    public static void main(String[] args)
    {
        int nums[] = {-1,0,1,2,-1,-4};
        ThreeSum(nums);
    }

    
}
