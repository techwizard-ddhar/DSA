// To find Largest element and Second Largest element

public class Test{

    public static void main(String[] args) {
        
        int A[] = {2, 4, 8, 6, 3};

    int max1, max2;
    max1 = max2 = 0;

    for(int i = 0; i < A.length; i++){
        
        if(max1 < A[i]){
            max2 = max1;
            max1 = A[i];
        }

        else if(A[i] > max2){
            max2 = A[i];
        }

    
    }

    System.out.println("Largest element is : " + max1);
    System.out.println("Second Largest element is : " + max2);

    }
}