/**
 * Created by Shirley on 2017/8/28.
 */
public class WhileTest {
    public static void main(String args[]){
       int[] arr={-1,2,4,9,7};
       int max=getMax(arr,arr.length);
       System.out.println(max);

    }

    public static int getMax(int[] arr,int length){
        int max=arr[0];
        for(int i=1;i<length;i++){
            max=max>arr[i]?max:arr[i];
        }
        return max;


    }
}
