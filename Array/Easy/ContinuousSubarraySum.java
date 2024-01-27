public class ContinuousSubarraySum {
    
    static boolean check(int nums[], int k){

        int maxLength = 0;
       for(int i=0;i<nums.length;i++)
       {
            int ans=0;
             for(int j=i;j<nums.length;j++)
             {
                 ans+=nums[j];
                 
                 if(ans % k == 0)
                 {
    
                     maxLength = (j - i + 1);

                     if(maxLength >= 2)
                     {
                        return true;
                     }
                
                }
            }
       }

       return false;
    }

    public static void main(String[] args) {
        
        int nums[] = {23,2,6,4,7};
        int k = 13;

        System.out.println(check(nums, k));
    }
}
