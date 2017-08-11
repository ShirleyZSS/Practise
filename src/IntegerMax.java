import javax.swing.text.Style;
import java.util.*;

/**
 * Created by Shirley on 2017/8/8.
 * 使用集合实现注册登陆功能
 *
 1、注册：提示用户输入注册的账号(数字)与密码，如果输入的id号已经存在集合中，提示用户重新输入。
            注册完毕之后，把集合中的所有用户信息打印出来。(使用：toArrry()方法)
 2、登陆：提示用户输入登陆的账号与密码,如果账号与密码这个用户已经存在集合中，那么登陆成功，否则登陆失败。
 */

class Person{
    int id;
    String psd;

    public Person(int id,String psd){
        this.id=id;
        this.psd=psd;
    }

    @Override
    public boolean equals(Object obj) {
        Person p=(Person)obj;
        if(p.id==this.id)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
       return "账号："+this.id+"密码："+this.psd;
    }
}

public class IntegerMax {
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        List list=new ArrayList();
        System.out.println("请输入您的功能选择 A(注册) B（登录）");
        while(in.hasNext()){
            String option=in.next();
            if("a".equalsIgnoreCase(option)){
                System.out.println("请输入您的注册账号：");
                Person p1;
                while (true) {
                    int id = in.nextInt();
                     p1 = new Person(id, null);
                    if (list.contains(p1)) {
                        System.out.println("该账号已存在，请重新输入账号:");
                    } else {
                        break;
                    }
                }
                System.out.println("请输入您的注册密码：");
                p1.psd=in.next();
                list.add(p1);
                System.out.println("注册完成，集合中的用户有：");
                Object[] obj=list.toArray();
                for(int i=0;i<obj.length;i++){
                    System.out.print(obj[i]);
                }
                System.out.println();
            }else if("b".equalsIgnoreCase(option)){
                System.out.println("请输入登录账号");
                int id=in.nextInt();
                System.out.println("请输入登录密码");
                String psd=in.next();
                //遍历集合List 查找账号与密码是否存在
                Iterator it=list.iterator();
              outer:  while(true) {
                    while (it.hasNext()) {
                        Person p2 = (Person) it.next();
                        if (!(p2.id == id && (p2.psd).equals(psd))) {
                            continue;
                        } else {
                            System.out.println("登录成功！！");
                            break outer;
                        }
                    }
                    System.out.println("账号或密码错误！");
                    break ;
                }
            }else {
                System.out.println("输入格式错误，请重新输入！");
            }
            System.out.println();
            System.out.println("请输入您的功能选择 A(注册) B（登录）");
        }
    }
}