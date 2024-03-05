public class KthMissingPositiveNumber {
    
    static int missingnumber(int arr[], int k){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= k){
                k = k + 1;
            }
            else{
                break;
            }
        }

        return k;
    }

    public static void main(String[] args) {
        
        int arr[] = {2,3,4,7,11};
        int k = 5;
        int ans = missingnumber(arr, k);
        System.out.println("The missing number is: " + ans);
    }
}
