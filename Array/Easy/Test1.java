// Insertion in an Array

import java.util.Scanner;

public class Test1 {
    
    public static void main(String[] args) {
        
        int A[] = new int[10];

        A[0] = 6; 
        A[1] = 8; 
        A[2] = 2; 
        A[3] = 4; 
        A[4] = 7;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the numberof elements : ");
        int n = sc.nextInt();

        System.out.println("Enter the index number : ");
        int index = sc.nextInt();

        System.out.println("Enter the element : ");
        int ele = sc.nextInt();

        for(int i = n-1; i >= index; i--){
            int temp = A[i];
            A[i+1] = temp;
        }

        A[index] = ele;

        for(int x: A){
            System.out.print(x + " ");
        }

    }
}
