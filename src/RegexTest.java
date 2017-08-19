import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by Shirley on 2017/8/17.
 */
public class RegexTest {
    public static void main(String args[]){
        //切割
        String str="大家家今天玩玩玩玩的的的的开心心心心";
        String regex="(.)\\1+";
        String[] str1=str.split(regex);
        for (int i=0;i<str1.length;i++) {
            System.out.print(str1[i]+" ");

        }
    }
}
