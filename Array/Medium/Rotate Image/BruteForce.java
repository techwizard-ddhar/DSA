public class BruteForce {
    
    static void rotate(int nums[][]){
        int rowLength = nums.length;
        int colLength = nums[0].length;

        int rotate[][] = new int[rowLength][colLength];

        for(int i = 0; i < rowLength; i++){
            for(int j = 0; j < colLength; j++){
                rotate[j][colLength-i-1] = nums[i][j];
            }
        }

        for(int arr[]: rotate){
            for(int ele: arr){
                System.out.print(ele + " ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        int nums[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        rotate(nums);
    }
    //Time complexity --> O(nxm)
    //Space complexity --> O(nxm)
}

