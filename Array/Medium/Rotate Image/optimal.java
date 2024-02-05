public class optimal {
    
    static void rotate(int matrix[][]){
        int rowLength = matrix.length;
        int colLength = matrix[0].length;


        //Trnspose--> column -> row
        for(int i = 0; i < rowLength; i++){
            for(int j = i; j < colLength; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        //reverse
        for(int j = 0; j < colLength; j++){
            int start = 0;
            int end = colLength-1;

            while(start < end){
                int temp = matrix[j][start];
                matrix[j][start] = matrix[j][end];
                matrix[j][end] = temp;

                start++;
                end--;
            }
        }

        for(int arr[]: matrix){
            for(int ele: arr){
                System.out.print(ele + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};

        rotate(matrix);
    }
    //Time complexity --> O(nxm)
    //Space complexity --> O(nxm)
}


