// public class SearchSingleEle {
    
//     static int singleNonDuplicate(int arr[]){

//         //Time complexity -> O(N)
//         int xor = 0;
//         for(int i = 0; i < arr.length; i++){
//             xor = xor ^ arr[i];
//         }

//         return xor;
//     }

//     public static void main(String[] args) {
        
//         int arr[] = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};

//         int ans = singleNonDuplicate(arr);

//         System.out.println("The single element is: " + ans);
//     }
// }


public class SearchSingleEle {
    
    static int singleNonDuplicate(int arr[]){

        //Time complexity -> O(log n)

        int n = arr.length;
        if(arr.length == 1){
            return arr[0];
        }
        if(arr[0] != arr[1]){
            return arr[0];
        }
        if(arr[n-1] != arr[n-2]){
            return arr[n-1];
        }
        
        int low = 1;
        int high = arr.length-2;
        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] != arr[mid-1] && arr[mid] != arr[mid+1]){
                return arr[mid];
            }

            if(mid % 2 == 0 && arr[mid] == arr[mid+1] 
            || mid % 2 == 1 && arr[mid] == arr[mid-1]){
                low = mid + 1;
            }

            else{
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        
        int arr[] = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};

        int ans = singleNonDuplicate(arr);

        System.out.println("The single element is: " + ans);
    }
}
