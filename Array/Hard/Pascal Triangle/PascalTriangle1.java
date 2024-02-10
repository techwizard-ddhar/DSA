//variation 2

public class PascalTriangle1{
    
    static void printNthrow(int n){

        int res = 1;
        System.out.print(res + " ");
        
        for(int i = 1; i < n; i++){
            res = res * (n - i);
            res = res / (i);
            System.out.print(res + " ");
        }
    }

    public static void main(String[] args) {
        
        int n = 5;
        printNthrow(n);
    }
}
