import java.util.HashSet;
import java.util.Scanner;

public class UnionOfArray {

    static void unique(int A[], int B[]){

       HashSet<Integer> hs = new HashSet<>();

       for(int i = 0; i < A.length; i++){
        hs.add(A[i]);
       }

       for(int j = 0; j < B.length; j++){
        hs.add(B[j]);
       }

       System.out.println(hs);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of an array-A : ");
        int a = sc.nextInt();

        int A[] = new int[a];

        System.out.println("Enter elements in an array-A : ");
        for(int i = 0; i < a; i++)
        {
            A[i] = sc.nextInt();
        }

        System.out.println("Enter size of an array-B : ");
        int b = sc.nextInt();

        int B[] = new int[b];

        System.out.println("Enter elements in an array-B : ");
        for(int i = 0; i < b; i++)
        {
            B[i] = sc.nextInt();
        }

        unique(A, B);
        
    }
    
}
