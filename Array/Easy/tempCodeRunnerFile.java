import java.util.ArrayList;

public class SortArray{

    static ArrayList<Integer> sort(int nums[]){

        ArrayList<Integer> arr = new ArrayList<>();

        int low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high){

            if(arr.get(mid) == 0){
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                low++;
                mid++;
            }

            if(arr.get(mid) == 1){
                mid++;
            }

            if(arr.get(mid) == 2){
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;

            }
        }

        return arr;
    } 

    public static void main(String[] args) {
        
        int nums[] = {2,0,2,1,1,0};

        ArrayList<Integer> res = sort(nums);

        for(int x : res){
            System.out.print(x + " ");
        }
    }
}




