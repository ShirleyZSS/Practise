import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Shirley on 2017/8/22.
 */
public class Test1 {
    public static void main(String args[]) throws IOException {
        File file=new File("C:\\Users\\25094\\Desktop\\users.txt");



        Scanner in=new Scanner(System.in);
        System.out.println("请选择登录（a）或者注册（b）功能：");
       while(true) {
           String ch = in.next();
           if (ch.equalsIgnoreCase("a")) {
               FileReader fileReader=new FileReader(file);
               BufferedReader bufferedReader=new BufferedReader(fileReader);
               System.out.println("请输入您的登录账号：");
               String username = in.next();
               String content = null;
               System.out.println("请输入您的登录密码：");
               String psw = in.next();
               String info=username+" "+psw;
               boolean flag=false;

               while ((content = bufferedReader.readLine()) != null) {
                   if (content.equals(info)) {
                       flag=true;
                       System.out.println("登陆成功！");
                   }

               }
               if(flag==false){
                   System.out.println("账号或密码错误！");
               }


           } else if (ch.equalsIgnoreCase("b")) {
               FileWriter fileWriter=new FileWriter(file,true);
               BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
               System.out.println("请输入您的注册账号：");
               String username = in.next();
               System.out.println("请输入您的注册密码：");
               String psd = in.next();
               String info = username + " " + psd;
               bufferedWriter.write(info);
               bufferedWriter.newLine();
               System.out.println("注册成功！");
               bufferedWriter.close();
           } else {
               System.out.println("输入选项无效，请重新输入！");
           }

         //  bufferedWriter.close();
           System.out.println("请选择登录（a）或者注册（b）功能：");
       }


    }
}
