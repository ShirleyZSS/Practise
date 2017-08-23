import java.io.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by Shirley on 2017/8/22.
 * 分割&合并mp3
 *
 */
public class SequenceInputStreamTest {
    public static void main(String args[]) throws IOException{
        //将文件分割成5份
        File file=new File("C:\\Users\\25094\\Music\\薛之谦 - 演员.mp3");
        FileInputStream fileInputStream=new FileInputStream(file);

        File file1=new File("C:\\Users\\25094\\Desktop\\part1.mp3");
        FileOutputStream fileOutputStream1=new FileOutputStream(file1);
        File file2=new File("C:\\Users\\25094\\Desktop\\part2.mp3");
        FileOutputStream fileOutputStream2=new FileOutputStream(file2);
        File file3=new File("C:\\Users\\25094\\Desktop\\part3.mp3");
        FileOutputStream fileOutputStream3=new FileOutputStream(file3);
        File file4=new File("C:\\Users\\25094\\Desktop\\part4.mp3");
        FileOutputStream fileOutputStream4=new FileOutputStream(file4);
        File file5=new File("C:\\Users\\25094\\Desktop\\part5.mp3");
        FileOutputStream fileOutputStream5=new FileOutputStream(file5);

        ArrayList<FileOutputStream> list=new ArrayList<>();
        list.add(fileOutputStream1);
        list.add(fileOutputStream2);
        list.add(fileOutputStream3);
        list.add(fileOutputStream4);
        list.add(fileOutputStream5);

        byte[] buf=new byte[1024*1024];
        int length=0;
        int i=0;
        while((length=fileInputStream.read(buf))!=-1){
            list.get(i).write(buf,0,length);
            i++;
        }
        fileOutputStream5.close();
        fileOutputStream4.close();
        fileOutputStream3.close();
        fileOutputStream2.close();
        fileOutputStream1.close();
        fileInputStream.close();

        //将分割后的文件再合成一份
        FileInputStream fileInputStream1=new FileInputStream(file1);
        FileInputStream fileInputStream2=new FileInputStream(file2);
        FileInputStream fileInputStream3=new FileInputStream(file3);
        FileInputStream fileInputStream4=new FileInputStream(file4);
        FileInputStream fileInputStream5=new FileInputStream(file5);
        File sumFile=new File("C:\\Users\\25094\\Desktop\\演员.mp3");
        FileOutputStream fileOutputStream=new FileOutputStream(sumFile);
        Vector<FileInputStream> vector=new Vector<>();
        vector.addElement(fileInputStream1);
        vector.addElement(fileInputStream2);
        vector.addElement(fileInputStream3);
        vector.addElement(fileInputStream4);
        vector.addElement(fileInputStream5);
        Enumeration<FileInputStream> e=vector.elements();
        SequenceInputStream sequenceInputStream=new SequenceInputStream(e);
        byte[] buf1=new byte[1024];
        int content=0;
        while((content=sequenceInputStream.read(buf1))!=-1){
            fileOutputStream.write(buf1,0 ,content);
        }
        fileOutputStream.close();
        fileInputStream5.close();
        fileInputStream4.close();
        fileInputStream3.close();
        fileInputStream2.close();
        fileInputStream1.close();







    }
}
