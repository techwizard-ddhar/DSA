public class Better {

    static void FindZero(int nums[][]){

        int rowLength = nums.length;
        int colLength = nums[0].length;
        int row[] = new int[rowLength];
        int col[] = new int[colLength];

        for(int i = 0; i < rowLength; i++){

            for(int j = 0; j < colLength; j++){ // O(nxm)

                if(nums[i][j] == 0){
                    row[i] = 1;

                    col[j] = 1;
                }
            }
        }

        for(int i = 0; i < rowLength; i++){
            for(int j = 0; j < colLength; j++){ //O(nxm)

                if(row[i] == 1 || col[j] == 1){
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
        
        int nums[][] = {{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};

        FindZero(nums);
    }
}
