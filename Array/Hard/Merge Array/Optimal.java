import java.util.Arrays;

public class Optimal {
    
    static void merge(int nums1[], int nums2[], int n, int m){

        int left = n-1;
        int right = 0;

        while(left >= 0 && right < m){
            if(nums1[left] >= nums2[right]){
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                left--;
                right++;
            }
            else{
                break; // Because arrays are already in sorted order
            }
        }
        int i = n + m - 1;
        int j = m-1;
        while(i >= n){
            nums1[i] = nums2[j];
            i--;
            j--; 
        }

        Arrays.sort(nums1);
        
        for(int ele : nums1){
            System.out.print(ele + " ");
        }


    }
    public static void main(String[] args) {
        int nums1[] = {4,5,6,0,0,0}; 
        int nums2[] = {1,2,3};
        int n = 3;
        int m = 3;

        merge(nums1, nums2, n, m);

        // for(int ele : nums1){
        //     System.out.print(ele + " ");
        // }

        // System.out.println("\n");
        
        // for(int ele1 : nums2){
        //     System.out.print(ele1 + " ");
        // }
    }
}
