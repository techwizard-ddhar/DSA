import java.util.*;

/*public class LeadersInAnArray {
    
    static void Leader(int nums[]){

        ArrayList<Integer> hs = new ArrayList<>();

        for(int i = 0; i < nums.length; i++)
        {
            int flag = 1;
            
            for(int j = i+1; j < nums.length; j++){ //Time complexity --> O(n^2)
                if(nums[j] > nums[i]){
                    flag = 0;
                    break;
                }
            }

            if(flag == 1){
                hs.add(nums[i]);
            }
        }

        System.out.print(hs + " ");
    }

    public static void main(String[] args) {
        
        int nums[] = {10, 22, 12, 3, 0, 6};

        Leader(nums);
    }
}*/

public class LeadersInAnArray {
    
    static ArrayList<Integer> Leader(int nums[]){

        ArrayList<Integer> hs = new ArrayList<>();

        int n = nums.length;
        int max = n-1; // If there is only one element, this element is the Leader
        hs.add(nums[n-1]);
        
        for(int i = n-2; i >= 0; i--) //Time Complexity --> O(n)
        {
            if(nums[i] > max){
                hs.add(nums[i]);
                max = nums[i];
            }
        }

        return hs; // Output --> 6, 12, 22 , Therefore we have to reverse it
    }

    public static void main(String[] args) {
        
        int nums[] = {10, 22, 12, 3, 0, 6};

        ArrayList<Integer> ans= Leader(nums);

        Collections.sort(ans, Collections.reverseOrder());

        for(int i = 0; i < ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }
}


