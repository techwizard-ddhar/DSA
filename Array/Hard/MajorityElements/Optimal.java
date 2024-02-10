import java.util.*;

public class Optimal {

    static void Greater(int nums[]){
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;
        int count1 = 0;
        int count2 = 0;

        for(int i = 0; i < nums.length; i++){

            if(count1 == 0 && ele2 != nums[i]){
                count1 = 1;
                ele1 = nums[i];
            }
            else if(count2 == 0 && ele1 != nums[i]){
                count2 = 1;
                ele2 = nums[i];
            }
            else if(ele1 == nums[i]){
                count1++;
            }
            else if(ele2 == nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        List<Integer> hs = new ArrayList<>();
        count1 = 0;
        count2 = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == ele1 || nums[i] == ele2){
                count1++;
                count2++;
            }
        }
        int value = nums.length/3;
        if(count1 > value || count2 > value){
            hs.add(ele1);
            hs.add(ele2);
        }

        System.out.println(hs);
    }
    
    public static void main(String[] args) {
        
        int nums[] = {3,2,3};
        Greater(nums);
    }
}
