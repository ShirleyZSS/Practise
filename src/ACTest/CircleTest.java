package ACTest;

import java.util.ArrayList;
import java.util.Scanner;

/**CVTE编程题1
 * Created by Shirley on 2017/9/2.
 * n个小朋友在做游戏，排成一个圈，
 * 从编号1的小朋友开始报数，报到m的出列，
 * 剩下的小朋友从1再开始报数，直到全部出列，
 * 打印出小朋友的出列顺序。
 *
 */
public class CircleTest {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        while(in.hasNext()){
            ArrayList<Integer> list=new ArrayList<>();
            ArrayList<Integer> list1=new ArrayList<>();
            int n=in.nextInt();
            int m=in.nextInt();
            int Zero=0;
            for(int i=0;i<n;i++){
                list.add(i+1);
            }
            //System.out.println(list);
            int count=1;//count记录报的数
            outer:for(int i=0;i<=list.size();i++){
                if(i==list.size()) {//循环至列表尾部则从头开始
                    i = 0;
                }
                if(list.get(i)!=0&&count==m){//跳过编号为0的同学 判断报数是否符合m
                    list1.add(list.get(i));//出圈编号记录在新的列表中
                    list.set(i,0); //出圈的位置编号为0
                    Zero++;//记录被编号为0的人数
                    if(Zero>=list.size()){
                        break outer;//当整个圈编号都为0 报数结束
                    }
                    count=1;//每出圈一个人 报数从1重新开始

                }else if(list.get(i)!=0){//跳过编号为0的同学继续向下报数
                    count++;
                }


            }
            System.out.println(list1);

            }

        }
    }
