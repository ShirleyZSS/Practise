import java.io.*;

/**
 * Created by Shirley on 2017/8/22.
 */
public class ReaderCopyTest {
    public static void main(String args[]) throws IOException {
       //找到目标文件
        File file=new File("C:\\Users\\25094\\Desktop\\阿里编程测验.txt");
        //建立数据输入通道
        FileReader fileReader=new FileReader(file);
        File file1=new File("C:\\Users\\25094\\Desktop\\阿里编程测验1.txt");
        FileWriter fileWriter=new FileWriter(file1);
        char[] buf=new char[1024];
        int length=0;
        while((length=fileReader.read(buf))!=-1){
            fileWriter.write(buf,0,length);
          //  fileWriter.flush();
        }
        fileWriter.close();
        fileReader.close();



    }
}
