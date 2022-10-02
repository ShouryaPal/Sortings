import java.util.Arrays;

/**
 * bubble
 */
public class bubble {

    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        

    }
    static void sort(int[] arr){
        boolean swapped;
        // run the steps for n-1 time 
        for(int i=0; i<arr.length;i++){
            swapped = false;
            // for each step max element will come at last index
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }

            }
            // If swap doesn't occur it will break the loop 
            if(swapped == false) break;
        }
    }
}