/*import java.util.*;

public class RRotateAnArray {
    
    static void RightRotate(int A[], int k)
    {
        
        int n = A.length;
        k = k % n;
        int temp[] = new int[k];

        //O(k)
        for(int i = 0; i < k; i++)
        {
            temp[i] = A[i];
        }

        //O(n-k)
        for(int i = k; i < n; i++){
            A[i-k] = A[i]; 
        }

        //O(k)
        int j = 0;
        for(int i = n-k; i < n; i++){
            A[i] = temp[j];
            j++;
        }

    }
    

    public static void main(String[] args) {
        
        int A[] = {1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter k value : ");
        int k = sc.nextInt();

        RightRotate(A,k);

        for(int val:A){
            System.out.print(val + " ");
        }
    }
}*/

// Time complexity --> O(k) + O(n-k) + O(k) = O(n-k)

// Space complexity = O(d) ? extra temp array

import java.util.*;

;public class RRotateAnArray {

    static void reverse(int A[], int start, int end){

        int i = start;
        int j = end;
        
        while(i < j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;

            i++;
            j--;
        }
    }

    static void rotate(int A[], int k){

        int n = A.length;
        k = k % n;
        if(k < 0){
            k = k + n;
        }
        //part 1 
        reverse(A, 0, A.length-k-1);

        //part 2
        reverse(A, A.length-k, A.length-1);

        reverse(A, 0, A.length-1);
    }

    static void Display(int A[])
    {

        StringBuilder sb = new StringBuilder();
        for(int x:A){
            sb.append(x + " ");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        
        int A[] = {1, 2, 3, 4, 5, 6, 7};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter k value : ");
        int k = sc.nextInt();

        rotate(A, k);

        Display(A);
        
    }
}