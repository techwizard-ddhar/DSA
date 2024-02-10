import java.util.*;

public class Optimal {
    
    static void triplet(int nums[]){

        List<List<Integer>> hs = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            
            if(i > 0 && nums[i] == nums[i-1]){
                i++;
            }
            int j = i+1;
            int k = nums.length-1;

            while(j < k){
                int sum = nums[i];
                sum += nums[j];
                sum += nums[k];
                if(sum < 0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    hs.add(temp);
                    j++;
                    k--;

                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;
                }
            }
        }

        System.out.println(hs);
    }

    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        triplet(nums);
    }
}
