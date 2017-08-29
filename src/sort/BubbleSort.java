package sort;

import java.util.Arrays;

/**
 * Created by Shirley on 2017/8/29.
 * 思路：相邻元素依次比较大小，如果符合条件则交换位置。
 *
 */
public class BubbleSort {
    public static void main(String args[]){
        int[] arr={0,-1,4,2,8,-2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){//控制轮数
            for(int j=0;j<arr.length-1-i;j++){//比较次数 找出最小值
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
