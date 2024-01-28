// Return Maximum Length of SubArray

/*public class LongestSubarray
{
    
    static int subarray(int nums[], int k)
    {

       int maxLength = 0;
       for(int i=0;i<nums.length;i++)
       {
            int ans=0;
             for(int j=i;j<nums.length;j++)
             {
                 ans+=nums[j];
                 if(ans==k)
                 {
    
                     maxLength = Math.max(maxLength, j - i + 1);
                
                }
            } 
       }
           return maxLength;
    }

    public static void main(String[] args) {
        
        int nums[] = {-1,1,1};
        int sum = 1;

        int res = subarray(nums, sum);
        System.out.println(res);
    }
}*/

// return Maximum count of SubArray 

/*public class LongestSubarray
{
    
    static int subarray(int nums[], int k)
    {

       int count = 0;
       for(int i=0;i<nums.length;i++)
       {
            int ans=0;
             for(int j=i;j<nums.length;j++)
             {
                 ans+=nums[j];
                 if(ans==k)
                 {

                    count++;
                
                }
            } 
       }
           return count;
    }

    public static void main(String[] args) {
        
        int nums[] = {1,2,1,2,1};
        int sum = 3;

        int res = subarray(nums, sum);
        System.out.println(res);
    }
}*/

//optimal code --> Hashing

import java.util.HashMap;

public class LongestSubarray
{
    
    static int subarray(int nums[], int k)
    {

       int sum = 0;
       int maxLength = 0;
       HashMap<Integer, Integer> hs = new HashMap<>();
       for(int i=0;i<nums.length;i++)
       {
            sum += nums[i];

            if(sum == k)
            {
                maxLength = Math.max(maxLength, i+1);
            }
            int previous = sum - k;

            if(hs.containsKey(previous))
            {
                int len = i - hs.get(previous);
                maxLength = Math.max(maxLength, len);
            }
            
            if(!hs.containsKey(sum))
            {
                hs.put(sum, i);
            }
            
       }
           
       return maxLength;
    }

    public static void main(String[] args) {
        
        int nums[] = {2,0,0,3};
        int sum = 3;

        int res = subarray(nums, sum);
        System.out.println(res);
    }
}
