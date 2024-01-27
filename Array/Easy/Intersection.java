import java.util.*;

class Intersection 
{
    static int[] intersect(int nums1[], int nums2[])
    {
        
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for(int i : nums1)
        {
            s1.add(i);
        }

        for(int j : nums2)
        {
            if(s1.contains(j))
            {
                s2.add(j);
            }
        }

        int res[] = new int[s2.size()];

        int i = 0;
        for(int val:s2){
            res[i] = val;
            i++;
        }

        return res;
    }

    public static void main(String[] args) {
        
        int nums1[] = {4,9,5};

        int nums2[] = {9,4,9,8,4};

        int a[] = intersect(nums1, nums2);
        for(int ele:a){
            System.out.print(ele + " ");
        }

    }


}
