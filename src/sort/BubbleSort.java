package sort;

import java.util.ArrayList;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            ArrayList<Integer> list=new ArrayList<>();
            int length=1;
            int n=in.nextInt();
            for(int i=0;i<n;i++){
                list.add(in.nextInt());
            }
            int flag=list.get(0);
            for(int j=1;j<list.size();j++){
                if(list.get(j)!=flag){
                    length++;
                    flag=list.get(j);
                }
            }
            System.out.println(length);

        }
    }
}
