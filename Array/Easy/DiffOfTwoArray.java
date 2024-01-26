public class DiffOfTwoArray {
    
    public static void main(String[] args) {
        
        int A[] = {2,3,6,4,2};
        int n1 = A.length;

        int B[] = {3,3,3,3,3};
        int n2 = B.length;

        int C[] = new int[n1 > n2? n1 : n2];
        int carry = 0;

        int i = A.length-1;
        int j = B.length-1;
        int k = C.length-1;

        while(k >= 0){

            if(B[j] + carry >= A[i]){
                C[k] = B[j] + carry - A[i];
                carry = 0;
            }
            else{
                C[k] = B[j] + carry + 10 - A[i];
                carry = -1;
            }

            i--;
            j--;
            k--;
        }

        int index = 0;

        while(index < C.length)
        {
            if(C[index] == 0){
            index++;
        }
        else{
            break;
        }

        }

        while(index < C.length)
        {
            System.out.print(C[index] + " ");
            index++;
        }
    }
}
