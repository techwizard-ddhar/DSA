public class Optimal
{
    
    static int[] findMissingRepeatingNumbers(int nums[])
    {

        int xor = 0;
        for(int i = 0; i < nums.length; i++)
        {
            xor = xor ^ nums[i];
            xor = xor ^ (i+1);
        }

        int bitNo = 0;
        while(true){
            if((xor & (1<<bitNo)) != 0){
                break;
            }
            bitNo++;
        }

        int zero = 0;
        int one = 0;
        for(int i = 0; i < nums.length; i++){
            if((nums[i] & (1<<bitNo)) != 0){
                one = one ^ nums[i];
            }
            else{
                zero = zero ^ nums[i];
            }
        }

        for(int i = 1; i <= nums.length; i++){
            if((i & (1<<bitNo)) != 0){
                one = one ^ i;
            }
            else{
                zero = zero ^ i;
            }
        }

        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == zero){
                count++;
            }
        }

        if(count == 2){
            return new int[] {zero, one};
        }
        else{
            return new int[] {one, zero};
        }
    }

    public static void main(String[] args)
    {
        int nums[] = {10, 11, 1, 12, 3, 4, 13, 8, 2, 6, 7, 9, 5, 3};

        int res[] = findMissingRepeatingNumbers(nums);

        for(int ele : res){
            System.out.print(ele + " ");
        }
    }
}
