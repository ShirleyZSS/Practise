import javax.swing.text.Style;
import java.util.*;

/**
 * Created by Shirley on 2017/8/8.
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
            }else if("b".equalsIgnoreCase(option)){
                System.out.println("请输入登录账号");
            }else {
                System.out.println("输入格式错误，请重新输入！");
            }
        }
    }
}