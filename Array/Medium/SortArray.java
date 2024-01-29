
//BruteForce Approach --> Use any sorting algorithm

//Beeter Appraoch
//Time complexity --> 0(2n) --> 2 different iteration.
//Space complexity --> O(1)
/*public class SortArray{

    static int[] sort(int nums[]){

        int count0 = 0; //Space complexity --> O(1)
        int count1 = 0;
        int count2 = 0;
        for(int ele: nums){ //Time complexity --> O(n)

            if(ele == 0){
                count0++;
            }
            else if(ele == 1){
                count1++;
            }
            else{
                count2++;
            }
        }

        // these 3 for loops will take Time complexity of O(n),
        //as these for loop size equal to total Array length.
        for(int i = 0; i < count0; i++){ 
            nums[i] = 0;
        }

        for(int j = count0; j < count0 + count1; j++){
            nums[j] = 1;
        }

        for(int k = count0 + count1; k < nums.length; k++){
            nums[k] = 2;
        }

        return nums;
    } 

    public static void main(String[] args) {
        
        int nums[] = {2,0,2,1,1,0};

        int res[] = sort(nums);

        for(int x : res){
            System.out.print(x + " ");
        }
    }
}*/

import java.util.ArrayList;
import java.util.Arrays;

public class SortArray{

    static void sort(ArrayList<Integer> arr, int n){
        
        int low = 0, mid = 0, high = n - 1;

        while(mid <= high){

            if(arr.get(mid) == 0){
                int temp = arr.get(low);
                arr.set(low, arr.get(mid));
                arr.set(mid, temp);
                
                low++;
                mid++;
            }

            else if(arr.get(mid) == 1){
                mid++;
            }

            // (arr.get(mid) == 2)
            else {
                int temp = arr.get(mid);
                arr.set(mid, arr.get(high));
                arr.set(high, temp);

                high--;

            }
        }

    
    } 

    public static void main(String[] args) {

        int n = 6;

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] {0, 2, 1, 2, 0, 1}));

        sort(arr, n);

        for(int i = 0; i < n; i++){
            System.out.print(arr.get(i) + " ");
        }


    }
}




