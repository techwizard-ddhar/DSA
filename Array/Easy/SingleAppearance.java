/*public class SingleAppearance {
    
    static int SingleNumber(int A[])
    {

        int count = 0;
        int res = 0;
        
        for(int i = 0; i < A.length; i++) // O(n)
        {
            count = 0;

            for(int j = 0; j < A.length; j++) // O(n)
            {
                
                if(A[i] == A[j])
                {
                    
                    count++;
                }
            }

            if(count == 1){
                res = A[i];
                break;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        
        int A[] = {1,1,2,3,1,2};

        int ans = SingleNumber(A);

        System.out.println(ans);
    }
}*/

//You must implement a solution with a linear runtime complexity and use only constant extra space.
// XOR --> Duplicate elements cancel each other, result in elements that appears once

class SingleAppearance{

    static int SingleNumber(int A[]){

        int xor = 0;

        for(int i = 0; i < A.length; i++){

            xor = xor ^ A[i];
        }

        return xor;

    }

    public static void main(String[] args)
    {
        
        int A[] = {1,1,2,3,1,2};

        int ans = SingleNumber(A);

        System.out.println(ans);
    }


}
