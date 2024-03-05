import java.util.*;

public class AggressiveCows {
    
    static boolean canWeplaceAllcows(int stalls[], int dist, int k){
        int NoOfcows = 1;
        int last = stalls[0];

        for(int i = 1; i < stalls.length; i++){
            if(stalls[i]-last >= dist){
                NoOfcows++;
                last = stalls[i];
            }

            if(NoOfcows >= k){
                return true;
            }
        }

        return false;
    }

    static int MaxMinimumDistance(int stalls[], int k){
        int n = stalls.length;
        Arrays.sort(stalls);
        int low = 1;
        int high = stalls[n-1] - stalls[0];

        while(low <= high){
            int mid = (low + high)/2;
            if(canWeplaceAllcows(stalls, mid, k) == true){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return high;
    }

    public static void main(String[] args) {
        int stalls[] = {0, 3, 4, 7, 10, 9};
        int k = 4;
        int ans = MaxMinimumDistance(stalls, k);
        System.out.println("The maximum possible minimum distance is: " + ans);
    }
}
