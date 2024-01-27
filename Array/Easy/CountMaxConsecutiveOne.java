
/*public class CountMaxConsecutiveOne {
    
    static int countMaxones(int A[]){

        int count = 0;
        int maxCount = 0;

        for(int ele : A){

            if(ele == 1){
                count += 1;
                if(count > maxCount){
                    maxCount = count;
                }
            }
            else{
                count = 0;
            }
        }
        

        return maxCount;
    }

    public static void main(String[] args) {
        
        int A[] = {1};

        int res = countMaxones(A);

        System.out.println(res);
    }
}*/

public class CountMaxConsecutiveOne {
    
    static int countMaxones(int A[]){

        int count = 0;
        int maxCount = 0;

        for(int i =0; i < A.length; i++){

            if(A[i] == 1){
                count += 1;
            }
            else{
                count = 0;
            }

            maxCount = Math.max(maxCount, count);
        }
        

        return maxCount;
    }

    public static void main(String[] args) {
        
        int A[] = {1,0,1,1,0,1};

        int res = countMaxones(A);

        System.out.println(res);
    }
}
