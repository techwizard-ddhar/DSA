import java.util.*;

public class Optimal {
    
    static List<List<Integer>> mergeOverlappingIntervals(int nums[][]){

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){

            if(list.isEmpty() || nums[i][0] > list.get(list.size()-1).get(1)){
                list.add(Arrays.asList(nums[i][0], nums[i][1]));
            }

            else{

                list.get(list.size()-1).set(1, Math.max(list.get(list.size()-1).get(1), nums[i][1]));
            }
        }

        return list;


    }

    public static void main(String[] args) {
        
        int nums[][] = {{1,3},{2,6},{8,9},{9,11},{8,10},{2,4},{15,18},{16,17}};

        List<List<Integer>> res = mergeOverlappingIntervals(nums);

        for(List<Integer> ans : res){
            System.out.print("[" + ans.get(0) + ", " + ans.get(1) + "]");
        }
    }
}
