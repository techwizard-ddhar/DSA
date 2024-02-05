import java.util.*;

public class BruteForce {
    
    static void spiral(int matrix[][]){

        int top = 0;
        int left = 0;
        int right = matrix[0].length-1;
        int bottom = matrix.length-1;
        List<Integer> nums = new ArrayList<>();

        while(top <= bottom && left <= bottom){
            
            // left to right
            for(int i = left; i <= right; i++){
                nums.add(matrix[top][i]);
            }
            top++;

            //top to bottom
            for(int i = top; i <= bottom; i++){
                nums.add(matrix[i][right]);
            }
            right--;

            //right to left
            if(top <= bottom){ // there are rows that has to be traversed
                for(int i = right; i >= left; i--)
                {
                    nums.add(matrix[bottom][i]);
                    
                }
                bottom--;
            }

            //bottom to top
            if(left <= right){ // there are columns that has to be traversed
                for(int i = bottom; i >= top; i--)
                {
                    nums.add(matrix[i][left]);
                   
                }
                left++;
            }
        }

        System.out.print(nums + " ");
    }

    public static void main(String[] args) {
        
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        spiral(matrix);
    }
}
