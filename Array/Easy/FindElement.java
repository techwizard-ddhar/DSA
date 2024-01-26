import java.util.Scanner;

public class FindElement {
    
    static void Search(int A[], int ele){

        for(int i = 0; i < A.length; i++){

            if(ele == A[i]){
                System.out.println("Element found at index " +  i);
                return;
            }
    
        }

        System.out.println("Element not found. ");

    }
    public static void main(String[] args) {

        int A[] = {15, 30, 40, 4, 11, 9};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to search : ");
        int ele = sc.nextInt();

        Search(A, ele);

    }
}
