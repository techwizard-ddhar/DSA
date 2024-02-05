/*public class StockBuyAndSell {

    static int StockPrice(int nums[]){

        int maxProfit = 0;

        for(int i = 0; i < nums.length; i++){
            
            int diff = 0;
            
            for(int j = i+1; j < nums.length; j++){ // Time Complexity --> O(n)

                if(nums[j] > nums[i]){
                    
                    diff = nums[j] - nums[i];

                    maxProfit = Math.max(maxProfit, diff);
                }
            }

        }

        return maxProfit;
    }

    public static void main(String[] args) {
        
        int nums[] = {7,6,4,3,1};

        System.out.println(StockPrice(nums));
    }
    
}*/

public class StockBuyAndSell {

    static int StockPrice(int nums[]){

        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){ //Time complexity --> O(n)

            minPrice = Math.min(minPrice, nums[i]);

            maxProfit = Math.max(maxProfit, nums[i] - minPrice);

        }

        return maxProfit;
    }

    public static void main(String[] args) {
        
        int nums[] = {7,1,5,3,6,4};

        System.out.println(StockPrice(nums));
    }
    
}

