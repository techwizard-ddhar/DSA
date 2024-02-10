import java.util.*;

public class Optimal {

    static void FindXor(int a[], int b){
        Map<Integer, Integer> hm = new HashMap<>();;
        int count = 0;
        int XOR = 0;

        for(int i = 0; i < a.length; i++){

            XOR = XOR ^ a[i];

            if(XOR == b){
                count++;
            }
            

            if(hm.containsKey(XOR ^ b))
            {
                count += hm.get(XOR ^ b);
            }
            
    
            hm.put(XOR, hm.getOrDefault(XOR, 0) + 1);
            

        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,3};
        int b = 3;

        FindXor(a, b);
    }
    
}
