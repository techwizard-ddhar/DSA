// Deletion

import java.util.Scanner;

public class Test2 {
    
    public static void main(String[] args) {
        
        int A[] = {2,6,4,1,7};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index number : ");
        int index = sc.nextInt();

        for(int i = index; i < A.length-1; i++){
            A[index] = A[i + 1];
        }

        int B[] = new int [A.length-1];

        for(int i = 0; i < A.length-1; i++){
            B[i] = A[i];
        }
        System.out.println("New array : ");

        for(int x:B){
            System.out.print(x + " ");
        }

    }
}
