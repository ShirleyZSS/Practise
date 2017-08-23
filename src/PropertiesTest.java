import java.io.*;
import java.util.Properties;

/**
 * Created by Shirley on 2017/8/23.
 *使用Properties实现本软件只能运行三次，超过三次之后就提示购买正版，退出jvm
 */
public class PropertiesTest {
    public static void main(String args[]) throws IOException {
        File file=new File("C:\\Users\\25094\\Desktop\\count.properties");
        Properties properties=new Properties();
        int count=1;
        if(file.exists()){
            properties.load(new FileInputStream(file));
        }else{
            file.createNewFile();
            properties.load(new FileInputStream(file));
        }
            String value=properties.getProperty("count");
        if(value!=null){
            count=Integer.parseInt(value);
            //判断
            if(count>=3){
                System.out.println("您已使用该软件超过3次，请购买正版软件！");
                System.exit(0);
            }else {
                count++;
                properties.setProperty("count",Integer.toString(count));
                properties.store(new FileOutputStream(file),"QQ");
                System.out.println("这是您第"+count+"次打开该软件！");
            }

        }else {
            //第一次打开软件
            properties.setProperty("count",Integer.toString(count));
            properties.store(new FileOutputStream(file),"QQ");
            System.out.println("这是您第"+count+"次打开该软件！");
        }


    }
}
