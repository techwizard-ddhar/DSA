//variation-1

public class PascalTriangle {
    
    static int FindEle(int n, int col){
        int res = 1;
        for(int i = 0; i < col; i++){
            res = res * (n - i);
            res = res / (i+1);
        }

        return res;
    }

    public static void main(String[] args) {
        
        int row = 5;
        int col = 3;

        int ans = FindEle(row-1, col-1);
        System.out.println(ans);
    }
}
