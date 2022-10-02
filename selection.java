import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void sort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int end = arr.length-i-1;
            int max = maxIndex(arr,0,end);
            
            int temp  = arr[max];
            arr[max]=arr[end];
            arr[end]=temp; 
        }
    }
    static int maxIndex(int[] arr ,int start,int end){
        int max= start; 
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]) max = i;
        }
        return max;
    }
}
