import java.util.*;

public class BruteForce {
    
    static void findKeyWithMaxCount(int nums[]){
        int maxCount = 0;
        int keyWithMaxCount = 0;
        HashMap<Integer, Integer> countMap = new HashMap<>();
    
        //storing
        for(int num : nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        //missing elements
        for(int ele : nums){
            int curEle = ele;
            if(countMap.containsKey(curEle+1)){
                curEle += 1;
            }
            else{
                System.out.println(ele+1);
                break;
            }
        }
    
        //searching duplicate elements
        for(Map.Entry<Integer, Integer> entry : countMap.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                keyWithMaxCount = entry.getKey();
            }
        }
    
        System.out.println(keyWithMaxCount);
    }

    public static void main(String[] args) {
        int nums[] = {10, 11, 1, 12, 3, 4, 13, 8, 2, 6, 7, 9, 5, 3};
        findKeyWithMaxCount(nums);
    }
    
}
