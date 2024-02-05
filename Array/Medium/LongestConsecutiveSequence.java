/*public class LongestConsecutiveSequence {
    
    static boolean LinearSearch(int nums[], int number){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == number){
                return true;
            }
        }
        return false;
    }
    static int LongestSequence(int nums[]){

        int longest = 1;
        for(int i = 0; i < nums.length; i++){

            int x = nums[i];
            int count = 1;

            while(LinearSearch(nums, x+1) == true){ //Time complexity --> O(n^2)
                x = x+1;
                count++;
            }
            longest = Math.max(longest, count);
        }

        return longest;
        
    }

    public static void main(String[] args) {
        int nums[] = {100, 200, 1, 3, 2, 4};

        int res = LongestSequence(nums);

        System.out.println(res);
    }
}*/

/*import java.util.*;

public class LongestConsecutiveSequence {
 
    static int LongestSequence(int nums[]){

        Arrays.sort(nums);
        int preElement = Integer.MIN_VALUE;
        int count = 0;
        int longest = 0;

        //if currElement == preElement--> Ignore and move forward

        for(int i = 0; i < nums.length; i++){ //Time complexity --> O(n)

            if(nums[i]-1 == preElement){ // Consecutive sequence --> currEle - preEle = 1
                count++;
                preElement = nums[i];
            }
            else if(nums[i] != preElement){
                count = 1;
                preElement = nums[i];
            }

            longest = Math.max(longest, count);
        }

        return longest;
        
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 1};

        int res = LongestSequence(nums);

        System.out.println("The longest consecutive sequence : " + res);
    }
}*/

import java.util.HashSet;

public class LongestConsecutiveSequence {
    
    static int LongestSequence(int nums[])
    {

       HashSet<Integer> hs = new HashSet<>();

       for(int i = 0; i < nums.length; i++)
       {
        hs.add(nums[i]);
       }

       int longest = 0;
       for(int ele : nums){
        
        int currEle = ele;
        int count = 1;

        while(hs.contains(currEle+1))
        {
            count++;
            currEle += 1;
        }

        longest = Math.max(longest, count);
       }

       return longest;
        
    }

    public static void main(String[] args) {
        int nums[] = {1,1,2,2,5,5,5,6,9,8,7};

        int res = LongestSequence(nums);

        System.out.println(res);
    }
}

