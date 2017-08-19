import java.io.File;
import java.util.ArrayList;

/**
 * Created by Shirley on 2017/8/19.
 * 需求：指定一个文件夹，然后列出文件夹下面所有的子文件和子文件夹，分开列出。
 */
public class FileTest {
    public static void main(String args[]){
        ArrayList<String> fileName=new ArrayList<>();
        ArrayList<String > dirName=new ArrayList<>();
        File file=new File( "C:\\Users\\25094\\Downloads\\java基础\\day19\\day19");
        File[] allFile=file.listFiles();
        for(int i=0;i<allFile.length;i++){
            if(allFile[i].isFile()){
                fileName.add(allFile[i].getName());
            }else if(allFile[i].isDirectory()){
                dirName.add(allFile[i].getName());
            }else{
            }
        }
        System.out.println("文件：");
      for(int i=0;i<fileName.size();i++){
            System.out.println("    "+fileName.get(i));
      }
        System.out.println("文件夹：");
        for(int i=0;i<dirName.size();i++){
            System.out.println("    "+dirName.get(i));
        }

    }
}
