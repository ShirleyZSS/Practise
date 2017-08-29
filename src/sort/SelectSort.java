package sort;

import java.util.Arrays;

/**
 * Created by Shirley on 2017/8/29.
 * 思路：每个元素依次与其他元素比较，符合条件则交换位置。
 */
public class SelectSort {
    public static void main(String args[]){
        int [] arr={1,4,6,0,-1,2};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] selectSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){//控制轮数
            for(int j=i+1;j<arr.length;j++){//每轮比较的次数
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }

}
