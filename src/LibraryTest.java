
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Shirley on 2017/8/15.
 */
class User1{
    String username;
    String psd;

    public User1(String username, String psd) {
        super();
        this.username = username;
        this.psd = psd;
    }

    public User1() {
    }
}

class Book2{
    String name;
    String author;
    String publish;
    double price;
    String id;
    Date date;

    public Book2(String name, String author, String publish, double price, String id, Date date) {
        super();
        this.name = name;
        this.author = author;
        this.publish = publish;
        this.price = price;
        this.id = id;
        this.date = date;
    }
}
public class LibraryTest {
    ArrayList<User1> list=new ArrayList<>();
    public static void main(String args[]){
        LibraryTest libraryTest=new LibraryTest();
        //首页面
       libraryTest.FirstPage();
       Scanner in=new Scanner(System.in);
       String str=in.next();
       if(str.equalsIgnoreCase("b")){
           //用户注册
           System.out.println("注册新用户");
           libraryTest.Register();
       }else if(str.equalsIgnoreCase("a")){
           //用户登录
           System.out.println("用户登录");

       }else if(str.equalsIgnoreCase("q")){
           //退出系统
       }else{
           //非法输入
       }



    }
    public void FirstPage(){
        for(int i=0;i<100;i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println("                                  欢迎使用河海大学图书管理系统");
        for(int i=0;i<100;i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println("请输入选择 (A)用户登录 (B)注册用户 (Q)退出系统");
    }
    //用户注册
    public void Register(){
        User1 u;
       System.out.println("输入用户名：");
       Scanner Rin=new Scanner(System.in);
       String username=Rin.next();
       System.out.println("输入密码：");
       String psd=Rin.next();
       u=new User1(username,psd);
       list.add(u);
       System.out.println("用户添加成功");
       System.out.println("请输入选择 (A)用户登录 (B)注册用户 (Q)退出系统");
    }
    public void Login(){
        Scanner Lin=new Scanner(System.in);
        User1 u=new User1();
        System.out.println("请输入用户名：");
        u.username=Lin.next();
        System.out.println("请输入密码：");
        u.psd=Lin.next();





    }
}
