import java.util.*;

public class BruteForce {
    
    static void Greater(int nums[]){
        
        int n = nums.length;
        List<Integer> ls = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = i; j < nums.length; j++){

                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > n/3){
                ls.add(nums[i]);
            }
        }

        System.out.println(ls);
    }

    public static void main(String[] args) {
        int nums[] = {3,2,3};
        Greater(nums);
    }
}
