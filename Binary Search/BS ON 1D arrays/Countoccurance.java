public class Countoccurance {
    
    static int FirstOccurance(int arr[], int n, int x){

        int low = 0;
        int high = n-1;
        int first = -1;

        while(low <= high){
            int mid = (low+high)/2;

            if(x == arr[mid]){
                first = mid;
                high = mid-1;
            }

            else if(x < arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return first;
    }

    static int LastOccurance(int arr[], int n, int x){

        int low = 0;
        int high = n-1;
        int last = -1;

        while(low <= high){
            int mid = (low+high)/2;

            if(x == arr[mid]){
                last = mid;
                low = mid+1;
            }

            else if(x < arr[mid]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return last;
    }

    static int NoOfCount(int arr[], int n, int x){
        int first = FirstOccurance(arr, n, x);
        int last = LastOccurance(arr, n, x);
        if(first == -1){
            return 0;
        }

        return (last-first+1);

    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 2, 2, 2, 3};
        int x = 2;
        int n = arr.length;

        int res = NoOfCount(arr, n, x);
        
        System.out.print(res);
    }

}
