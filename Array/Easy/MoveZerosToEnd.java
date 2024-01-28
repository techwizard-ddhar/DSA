import java.util.Scanner;

public class MoveZerosToEnd {
    
    static void MoveZeros(int A[])
    {
        
        int i = 0;
        for(int ele:A)
        {
            if(ele != 0)
            {
                A[i] = ele;
                i++;
            }
        }

        while(i < A.length){
            A[i] = 0;
            i++;
        }
    }

    static void Display(int A[]){

        StringBuilder sb = new StringBuilder();

        for(int val : A){
            sb.append(val + " ");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array : ");
        int n = sc.nextInt();

        int A[] = new int[n];

        System.out.println("Enter elements in an array : ");
        for(int i = 0; i < n; i++)
        {
            A[i] = sc.nextInt();
        }

        MoveZeros(A);
        Display(A);
    }
}
