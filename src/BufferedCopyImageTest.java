import java.io.*;

/**
 * Created by Shirley on 2017/8/21.
 */
public class BufferedCopyImageTest {
    public static void main(String args[])throws IOException{
        File file=new File("C:\\Users\\25094\\Desktop\\赵姗姗1.jpg");
        File file1=new File("C:\\Users\\25094\\Desktop\\赵姗姗2.jpg");

        FileInputStream fileInputStream=new FileInputStream(file);
        FileOutputStream fileOutputStream=new FileOutputStream(file1);

        BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);

        int content=0;
        while((content=bufferedInputStream.read())!=-1){
            bufferedOutputStream.write(content);
            bufferedOutputStream.flush();
        }
        fileOutputStream.close();
        fileInputStream.close();


    }
}
