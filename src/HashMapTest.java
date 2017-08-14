import javax.xml.ws.EndpointReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by Shirley on 2017/8/14.
 */
public class HashMapTest {
    public static void main(String args[]) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1","赵姗姗");
        map.put("2","范媛媛");
        map.put("3","陈晓丽");
        Set<Map.Entry<String,String>> entrySet=map.entrySet();
        Iterator<Map.Entry<String ,String >> it=entrySet.iterator();
        while (it.hasNext()){
            Map.Entry<String ,String > entry=it.next();
            System.out.println("键："+entry.getKey()+"值："+entry.getValue());
        }
    }
}
