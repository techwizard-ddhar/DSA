public class BruteForce {
    
    static void setRows(int nums[][], int m, int i){

        for(int j = 0; j < m; j++){
            if(nums[i][j] != 0){
                nums[i][j] = -1;
            }
        }
    }

    static void setColumn(int nums[][], int n, int j){

        for(int i = 0; i < n; i++){
            if(nums[i][j] != 0){
                nums[i][j] = -1;
            }
        }
    }

    static void FindZero(int nums[][]){

        int rowLength = nums.length;
        int colLength = nums[0].length;

        for(int i = 0; i < rowLength; i++){
            for(int j = 0; j < colLength; j++){ // O(nxm)

                if(nums[i][j] == 0){
                    setRows(nums, colLength, i); //O(n)
                    setColumn(nums, rowLength, j); //O(m)
                }
            }
        }

        for(int i = 0; i < rowLength; i++){
            for(int j = 0; j < colLength; j++){ //O(nxm)

                if(nums[i][j] == -1){
                    nums[i][j] = 0;
                }
            }
        }

        for(int arr[] : nums){
            for(int ele : arr){
                System.out.print(ele + " ");;
            }

            System.out.println("\n");
        }


    }

    public static void main(String[] args) {
        
        int nums[][] = {{1,1,1}, {1,0,1}, {1,1,1}};

        FindZero(nums);
    }
}
