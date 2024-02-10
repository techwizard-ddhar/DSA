//variation 3

import java.util.*;

public class PascalTriangle2 {
    
    static int FindEle(int n, int col){
        int res = 1;
        for(int i = 0; i < col; i++){
            res = res * (n - i);
            res = res / (i+1);
        }

        return res;
    }

    static void printAll(int numRows){

        List<List<Integer>> arr = new ArrayList<>();

        for(int row = 1; row <= numRows; row++){
            List<Integer> temp = new ArrayList<>();
            for(int col = 1; col <= row; col++){
                int ans = FindEle(row-1, col-1);
                temp.add(ans);
            }
            arr.add(temp);
        }

        for(List<Integer> ele : arr){
            for(int x : ele){
                System.out.print(x + " ");
            }

            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        
        int n = 5;
        printAll(n);
    }
}