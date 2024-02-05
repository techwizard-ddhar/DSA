import java.util.*;

public class NextPermutation {
    
    static List<Integer> permutation(List<Integer> arr)

    {

        int n = arr.size();
        int breakpoint = -1;

        //i = n-2 --> last breakpoint where you can see a dip
        for(int i = n-2; i >= 0; i--){
            if(arr.get(i) < arr.get(i+1)){
                breakpoint = i;
                System.out.println(i);
                break;
            }
        }

        if(breakpoint == -1){
            Collections.reverse(arr);
            return arr;
        }

        for(int i = n-1; i > breakpoint; i--)
        {
            if(arr.get(i) > arr.get(breakpoint))
            {
                int temp = arr.get(breakpoint);
                arr.set(breakpoint, arr.get(i));
                arr.set(i, temp);
                break;
            }
        }

        List<Integer> sublist = arr.subList(breakpoint + 1, n);
        Collections.reverse(sublist);

        return arr;

    }

    public static void main(String[] args) {

        List<Integer> arr = Arrays.asList(new Integer[] {2,1,5,4,3,0,0});

        List<Integer> ans = permutation(arr);

        System.out.print("The next permutation is: ");

        for (int i = 0; i < ans.size(); i++)
        {
            System.out.print(ans.get(i) + " ");
        }

        
    }
    

}
