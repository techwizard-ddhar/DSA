public class CheckIfAnArrayIsSorted {
    
    static boolean check(int A[]){

        
        for(int i = 0; i < A.length-1; i++)
        {
                if(A[i+1] < A[i]){
                    return false;
                }
            
        }

        return true;
    }

    public static void main(String[] args) {
        
        int A[] = {1,2,8,10,5};

        System.out.println(check(A));

    }
}
