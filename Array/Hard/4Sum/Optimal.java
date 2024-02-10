import java.util.*;

public class Optimal {
    
    static void quadruplets(int nums[]){

        List<List<Integer>> hs = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            for(int j = i+1; j < nums.length; j++){
                
                if(j > i+1 && nums[j] == nums[j-1])
                {
                    continue;
                }
                int k = j+1;
                int l = nums.length-1;
    
                while(k < l){
                    long sum = nums[i];
                    sum += nums[j]; 
                    sum += nums[k]; 
                    sum += nums[l];
                    if(sum < -294967296)
                    {
                        k++;
                    }
                    else if(sum > -294967296)
                    {
                        l--;
                    }
                    else{
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        hs.add(temp);
                        k++;
                        l--;
    
                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(k < l && nums[l] == nums[l+1]) l--;
                    }
                }
            }
        }

        System.out.println(hs);
    }

    public static void main(String[] args) {
        int nums[] = {1000000000,1000000000,1000000000,1000000000};
        quadruplets(nums);
    }
}

