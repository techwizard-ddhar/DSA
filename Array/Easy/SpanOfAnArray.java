//Span of an Array -> difference between max and min element in an array

import java.util.Scanner;

public class SpanOfAnArray {
    

    static int maximum(int A[]){

        int max = 0;
        for(int i = 0; i < A.length; i++){
            
            if(max < A[i]){
                max = A[i];
            }
        }

        return max;
    }

    static int minimum(int A[]){

        int min = A[0];

        for(int i = 0; i < A.length; i++){
            
            if(min > A[i]){
                min = A[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements in an array : ");
        int A[] = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }

        
        int a = maximum(A);
        int b = minimum(A);

        System.out.println("Difference between Largest and Smallest Elemet : " + (a - b));

    }
}
