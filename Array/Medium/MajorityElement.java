//Time complexity --> O(n^2)
/*public class MajorityElement {
    
    static int Major(int nums[]){

        for(int i = 0; i < nums.length; i++){
            int count = 0;

            for(int j = 0; j < nums.length; j++){

                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > (nums.length)/2){
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int nums[] = {3,2,3};

        int res = Major(nums);

        System.out.println(res);
    }
}*/

/*import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    
    static int Major(int nums[]){

        HashMap<Integer, Integer> hs = new HashMap<>();

        //storing elelment in a Hash Table
        for(int i = 0; i < nums.length; i++){
            int value = hs.getOrDefault(nums[i], 0);
            hs.put(nums[i], value + 1);
        }

        //searching in Hash Table
        for(Map.Entry<Integer, Integer> hm : hs.entrySet()){
            if(hm.getValue() > (nums.length)/2){
                return hm.getKey();
            }
            
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int nums[] = {3,2,3};

        int res = Major(nums);

        System.out.println(res);
    }
}*/

public class MajorityElement {
    
    static int Major(int nums[]){

       int count = 0;
       int element = 0;

       for(int i = 0; i < nums.length; i++){
        if(count == 0){
            count = 1;
            element = nums[i];
        }
        else if(element == nums[i]){
            count++;
        }
        else{
            count--;
        }
       }

       int count1 = 0;
       for(int i = 0; i < nums.length; i++){
        if(nums[i] == element){
            count1++;
        }
       }
       if(count1 > (nums.length)/2){
        return element;
       }

       return -1;
    }

    public static void main(String[] args) {
        
        int nums[] = {3,2,3};

        int res = Major(nums);

        System.out.println(res);
    }
}