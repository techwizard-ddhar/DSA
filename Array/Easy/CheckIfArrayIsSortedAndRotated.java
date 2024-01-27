import java.util.Scanner;

public class CheckIfArrayIsSortedAndRotated {
    
    static boolean check(int A[]){

        int irregularities = 0;

        for(int i = 0; i < A.length; i++){
            if(A[i] > A[(i+1) % A.length]){
                irregularities++;
            }
        }

        return irregularities > 1 ? false : true;
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
        

        System.out.println(check(A));

    }

}
