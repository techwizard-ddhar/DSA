public class BruteForce {
    
    static void merge(int arr1[], int arr2[], int n, int m){

        int arr3[] = new int[n+m];
        
        int left = 0;
        int right = 0;
        int index = 0;

        while(left < n && right < m)
        {
            if(arr1[left] <= arr2[right]){
                arr3[index] = arr1[left];
                left++;
                index++;
            }
            else{
                arr3[index] = arr2[right];
                right++;
                index++;
            }
        }

        while(left < n){
            arr3[index] = arr1[left];
            left++;
            index++;
        }

        while(right < m){
            arr3[index] = arr2[right];
            right++;
            index++;
        }

        for(int i = 0; i < arr3.length; i++){
            if(i < n){
                arr1[i] = arr3[i];
            }
            else{
                arr2[i-n] = arr3[i];
            }
        }

    }
//Time complexity --> O(n+m) + O(n+m)
//Space complexity --> O(n+m)
    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7}; 
        int arr2[] = {0, 2, 6, 8, 9};
        int n = 4;
        int m = 5;

        merge(arr1, arr2, n, m);

        for(int ele : arr1){
            System.out.print(ele + " ");
        }

        System.out.println("\n");
        
        for(int ele1 : arr2){
            System.out.print(ele1 + " ");
        }

    }
}
