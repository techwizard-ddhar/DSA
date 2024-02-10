import java.util.*;

public class Better {
    
    static void Greater(int nums[]){
        HashMap<Integer, Integer> hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        //storing
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        //searching
        for(Map.Entry<Integer,Integer> hs: hm.entrySet()){
            if(hs.getValue() > nums.length/3){
                list.add(hs.getKey());
            }
        }

        System.out.println(list);

    }

    public static void main(String[] args) {
        
        int nums[] = {1,1,1,2,2,3,3,3};
        Greater(nums);
    }
}
