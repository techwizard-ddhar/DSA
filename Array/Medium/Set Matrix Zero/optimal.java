public class optimal {

    static void FindZero(int nums[][]){

        int rowLength = nums.length;
        int colLength = nums[0].length;
        int col0 = 1;

        for(int i = 0; i < rowLength; i++){

            for(int j = 0; j < colLength; j++){ // O(nxm)

                if(nums[i][j] == 0){
                    
                    nums[i][0] = 0;

                    if(j != 0){
                        nums[0][j] = 0;
                    }
                    else{
                        col0 = 0;
                    }
                }
            }
        }

        for(int i = 1; i < rowLength; i++){
            for(int j = 1; j < colLength; j++){
                if(nums[0][j] == 0 || nums[i][0] == 0){
                    nums[i][j] = 0;
                }
            }
        }

        if(nums[0][0] == 0){
            for(int j = 0; j < colLength; j++){
                nums[0][j] = 0;
            }
        }

        if(col0 == 0){
            for(int i = 0; i < rowLength; i++){
                nums[i][0] = 0;
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
        
        int nums[][] = {{1,1,1,1}, {1,0,1,1}, {1,1,0,1}, {0,1,1,1}};

        FindZero(nums);
    }
}


