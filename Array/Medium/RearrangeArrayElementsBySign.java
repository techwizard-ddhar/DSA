//Varirty - 1

/*public class RearrangeArrayElementsBySign 
{
    
    static void reArrange(int nums[])
    {

        int arr[] = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;

        for(int i = 0; i < nums.length; i++)
        {

            if(nums[i] > 0)
            {
                arr[posIndex] = nums[i];
                posIndex += 2;
            }
            else
            {
                arr[negIndex] = nums[i];
                negIndex += 2;
            }
        }

        for(int ele:arr)
        {
            System.out.print(ele + " ");
        }

    }

    public static void main(String[] args) {
        
        int nums[] = {1,2,-3,-1,-2,3};

        reArrange(nums);
    }

}*/

//Variety - 2

public class RearrangeArrayElementsBySign 
{
    
    static void reArrange(int nums[])
    {

        int arr[] = new int[nums.length];
        int posIndex = 0;
        int negIndex = 1;

        for(int i = 0; i < nums.length; i++)
        {

            if(nums[i] > 0)
            {
            
                if(posIndex < nums.length){
                    arr[posIndex] = nums[i];
                    posIndex += 2;
                }
                else{
                    arr[i] = nums[i];
                }
            }
            else
            {
                
                if(negIndex < nums.length){
                    arr[negIndex] = nums[i];
                    negIndex += 2;
                }
                else{
                    arr[i] = nums[i];
                }
            }
        }

        for(int ele:arr)
        {
            System.out.print(ele + " ");
        }

    }

    public static void main(String[] args) {
        
        int nums[] = {1,2,-4,-5,3,4};

        reArrange(nums);
    }

}

