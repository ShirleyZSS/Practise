import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by charmyyy on 2017/9/8.
 */
public class TreeSetTest {
    public static void main(String args[]){
        /*
        Scanner sc = new Scanner(System.in);
        String  line = "";
        System.out.println("输入点东西试试吧:");
        while(true){
            line = sc.nextLine();
            char[] chars = line.toCharArray();
            int length = chars.length;
            int m = -1;
//            a :for(int i=0;i<length;i++){
            a : for(int j=1;j<length;j++){
                int low = 0;
                int high = j;
                while (chars[low]==chars[high]){
                    if(high==length-1){

                        m = j;
                        break a;
                    }
                    low = low+1;
                    high = high+1;
                }
            }
//            }
            if(m==-1){
//                System.out.println(k);
//                System.out.println(m);
//                System.out.println("");
                System.out.println(line+line);
            }else {
//                System.out.println(k);
//                System.out.println(m);
//                System.out.println("sssss");
                int x = length-m;
                System.out.print(line);
                for(;x<length;x++){
                    System.out.print(chars[x]);
                }
                System.out.println();

            }
//            System.out.println(line);
        }
        */

        Scanner in=new Scanner(System.in);

        while(in.hasNext()){
            ArrayList<String> list=new ArrayList<>();
            String str=null;
             str=in.nextLine();
            for(int i=0;i<str.length();i++){
                String str1=str.substring(i+1);
                String str2=str.substring(0,str.length()-i-1);
                if(str1.equals(str2)){
                    list.add(str1);
                }
            }
            String sub=list.get(0);
            for(int i=1;i<list.size();i++){
                if(sub.length()<list.get(i).length()){
                    sub=list.get(i);
                }
            }
            int length=sub.length();//重复子串的长度
          // System.out.println(sub);
            if(str.length()>=2*sub.length()){
                StringBuilder sb=new StringBuilder();
                sb.append(str);
                sb.append(str.substring(length));
                System.out.println(sb);
            }else{
                System.out.println(str);
            }
            //System.out.println(sb);

            }
        }
    }