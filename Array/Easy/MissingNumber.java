/*import java.util.Scanner;

public class MissingNumber {

    static int find(int A[], int n)
    {

        int count[] = new int[n+1];       //O(n) --> extra space
        
        for(int i = 0; i < count.length; i++){

            count[i] = i;
        }

        for (int i = 0; i < count.length; i++) // O(n)
        {
            boolean found = false;
            for (int j = 0; j < A.length; j++) // O(n)
            {
                if (count[i] == A[j]) 
                {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return count[i];
            }

        }

        return -1;
    
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of an array : ");
        int n = sc.nextInt();

        int A[] = new int[n];

        System.out.println("Enter elements in an array : ");
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }


        int res = find(A, n);
        System.out.println(res);
    }

}*/

/*import java.util.Scanner;

public class MissingNumber {

    static int find(int A[], int n)
    {
        for (int i = 0; i < n+1; i++)  //O(n)
        {
            int flag = 0;
            for (int j = 0; j < n; j++)  //O(n)
            {
                if (A[j] == i) // Time complexity = O(n*n)
                {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) 
            {
                return i;
            }

        }

        return -1;
    
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of an array : ");
        int n = sc.nextInt();

        int A[] = new int[n];

        System.out.println("Enter elements in an array : ");
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }


        int res = find(A, n);
        System.out.println(res);
    }

}*/

/*class MissingNumber{

    static int find(int A[], int n){

        int xor1 = 0;
        int xor2 = 0;

        // what is the use of it, as the Time Complexity remaind O(n*n)
        
        for(int i = 1; i <= n; i++){ //O(n)
            xor1 = xor1 ^ i;
        }

        for(int i = 0; i < A.length; i++){  //O(n)
            xor2 = xor2 ^ A[i];
        }

        return xor1 ^ xor2;


    }

    public static void main(String[] args) {
        
        int A[] = {1,4,3,5};
        int n = 5;

        int res = find(A, n);

        System.out.println(res);
    }
}*/



class MissingNumber{

    static int find(int A[], int n){

        int xor1 = 0;
        int xor2 = 0;

        // what is the use of it, as the Time Complexity remaind O(n*n)
        // i will use only one for loop

        for(int i = 0; i < n-1; i++){  //O(n)
            xor2 = xor2 ^ A[i]; // 0 1 2 3
            xor1 = xor1 ^ (i+1);// 1 2 3 4, what about 5 ?
        }

        xor1 = xor1 ^ n;

        return xor1 ^ xor2;


    }

    public static void main(String[] args) {
        
        int A[] = {2,4,3,5};
        int n = 5;

        int res = find(A, n);

        System.out.println(res);
    }
}

