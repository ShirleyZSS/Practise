import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Shirley on 2017/8/12.
 * 将字符串中的数值排序
 * String str="8 10 15 5 2 7";
 * 要求使用TreeSet
 */
public class TreeSetTest {
    public static void main(String args[]){
        String str="8 10 15 5 2 7";
        String strn[]=str.split(" ");
        TreeSet ts=new TreeSet();
        for(int i=0;i<strn.length;i++){
            ts.add(Integer.parseInt(strn[i]));
        }
        System.out.println(ts);

    }

}
