public class RoatatedArray2 {
    
    static boolean FindElement(int A[], int n, int target){
        
        int low = 0;
        int high = n-1;
    
        while(low <= high){
            int mid = (low+high)/2;

            if(target == A[mid]){
                return true;
            }
            
            if(A[low] == A[mid] && A[mid] == A[high]){
                low++;
                high--;
                continue;
            }
            
            if(A[low] <= A[mid]){
                if(A[low] <= target && target <= A[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(A[mid] <= target && target <= A[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int A[] = {1, 0, 1, 1, 1};
    
        int n = A.length;
    
        int target = 0;
    
        boolean res = FindElement(A, n, target);
    
        System.out.println(res);
    }
}
    

