/**
 * Created by Shirley on 2017/9/5.
 */
public class TrimTest {
    public static void main(String[] args) {
        System.out.println(MyTrim("    嘻嘻嘻   哈哈哈   "));

    }
    public static String MyTrim(String str) {
        int startIndex=0;
        int endIndex=str.length()-1;
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++) {
            if(arr[i]!=' ') {
                startIndex=i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--) {
            if(arr[i]!=' ') {
                endIndex=i;
                break;
            }
        }

        if(startIndex<endIndex) {
            return str.substring(startIndex, endIndex+1);
        }else {
            return "";
        }


    }

}
