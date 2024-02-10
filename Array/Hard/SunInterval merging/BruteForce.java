import java.util.*;

public class BruteForce {
    static List<List<Integer>> mergeOverlappingIntervals(int nums[][]){

        List<List<Integer>> list = new ArrayList<>();

        
        Arrays.sort(nums, new Comparator<int[]>() {
            public int compare(int a[], int b[]) {
                return a[0] - b[0];
            }
        });
        
        for(int i = 0; i < nums.length; i++){
            int start = nums[i][0];
            int end = nums[i][1];

            //skip all merged intervals
            if(!list.isEmpty() && end <= list.get(list.size()-1).get(1)){
                continue;
            }
            
            for(int j = i+1; j < nums.length; j++){

                if(nums[j][0] <= end){
                    end = Math.max(end, nums[j][1]);
                }
                else{
                    break;
                }
            }
            // List<Integer> temp = new ArrayList<>();
            // temp.add(start);
            // temp.add(end);
            list.add(Arrays.asList(start, end));
            
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