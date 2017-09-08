import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Shirley on 2017/9/8.
 */
public class Main {
    public static void main(String[] args){
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
