import java.util.*;

public class Optimal{
      
    static int merge(int nums[], int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); 
        int left = low;      
        int right = mid + 1;

        //storing elements in the temporary array in a sorted manner//

        int count = 0;

        while (left <= mid && right <= high) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                count += (mid-left+1);
                right++;
            }
        }


        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }

        while (right <= high) {
            temp.add(nums[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            nums[i] = temp.get(i - low);
        }

        return count;
    }

    public static int mergeSort(int[] nums, int low, int high) {
        int count = 0;
        if (low >= high) return count;
        int mid = (low + high) / 2 ;
        count += mergeSort(nums, low, mid);  
        count += mergeSort(nums, mid + 1, high); 
        count += merge(nums, low, mid, high);
        return count;
    }

    public static int numberOfInversion(int nums[]){
        return mergeSort(nums, 0, nums.length-1);

    }

    public static void main(String[] args) {
        int nums[] = {5, 4, 3, 2, 1};
        int cnt = numberOfInversion(nums);
        System.out.println("The number of inversions are: " + cnt);
    }
}
