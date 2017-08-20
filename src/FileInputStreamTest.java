import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Shirley on 2017/8/20.
 */
public class FileInputStreamTest {
    public static void main(String args[]) throws IOException{
        File file=new File("C:\\Users\\25094\\Desktop\\进程1.txt");
            FileInputStream fileInputStream=new FileInputStream(file);
            byte[] buf=new byte[1024];
            int length=0;
            while((length=fileInputStream.read(buf))!=-1){
                System.out.print(new String(buf,0,length));
            }
            fileInputStream.close();



    }
}
