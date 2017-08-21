import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Shirley on 2017/8/20.
 */
public class CopyImageTest {
    public static void main (String args[]) throws IOException{
        File file=new File("C:\\Users\\25094\\Desktop\\赵姗姗1.jpg");
        FileInputStream fileInputStream=new FileInputStream(file);
        File file1=new File("C:\\Users\\25094\\Desktop\\赵姗姗2.jpg");
        FileOutputStream fileOutputStream=new FileOutputStream(file1);
        byte[] buf=new byte[1024];
        int length=0;
        while(fileInputStream.read(buf)!=-1){
            fileOutputStream.write(buf);
        }
        fileInputStream.close();
        fileOutputStream.close();



    }

}

