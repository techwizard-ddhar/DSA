/*public class ReverseAnArray {
    
    public static void main(String[] args) {
        
        int A[] = {10, 20, 30, 40, 50};

        System.out.println("Reversed Array : ");

        for(int i = A.length-1; i >= 0; i--){
            System.out.print(A[i] + " ");
        }
    }
}*/

public class ReverseAnArray{

    static void reverse(int A[]){
        int i = 0;
        int j = A.length-1;

        while(i < j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;

            i++;
            j--;
        }

    }

    static void Display(int A[]){

        StringBuilder sb = new StringBuilder();
        for(int x:A){
            sb.append(x + " ");
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {
        
        int A[] = {10, 20, 30, 40, 50};

        reverse(A);
        Display(A);
    }
}
