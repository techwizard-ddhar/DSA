import java.util.Scanner;

public class RemoveDuplicates {
    
    static int remove(int A[])
    {

            int i = 0;
            for(int j = 1; j < A.length; j++)
            {
                if(A[i] != A[j])
                {
                    i++;
                    A[i] = A[j];
                }
            
            }

            return i+2;
        
    }

    static void Display(int A[], int length){
        
        int l = length;
        for(int i = 0; i < l; i++){
            System.out.print(A[i] + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int n = sc.nextInt();

        int A[] = new int[n];

        System.out.println("Enter elements in an array : ");
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        

        int k = remove(A);
        Display(A, k);
    }
}
