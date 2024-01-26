public class SumOfArray {
    
    public static void main(String[] args) {
        
        int A[] = {3,1,0,7,8};
        int n1 = A.length;
        int B[] = {1,5,9,8,7,6};
        int n2 = B.length;

        int C[] = new int[n1 > n2? n1 : n2];

        int i = A.length-1;
        int j = B.length-1;
        int k = C.length-1;
        int carry = 0;

        while(k >= 0){
            if(i >= 0){
                C[k] += A[i];
            }

            if(j >= 0){
                C[k] += B[j];
            }

            C[k] += carry;

            carry = C[k] / 10;
            C[k] = C[k] % 10;

            i--;
            j--;
            k--;
        }

        for(int x:C){
            System.out.print(x + " ");
        }
    }
}
