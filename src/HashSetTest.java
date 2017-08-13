import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by Shirley on 2017/8/12.
 * 键盘录入用户名和密码 如果已经存在在集合中视为重复不允许添加 用HashSet实现
 */
class User{
    String  username;
    String password;

    public User(String username,String password){
        super();
        this.username=username;
        this.password=password;

    }

    @Override
    public int hashCode() {
        return this.username.hashCode()+(this.password).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        User user=(User)obj;
        if(user.username.equals(this.username)&&(user.password).equals(this.password))
            return true;
        else
            return false;
    }
}
public class HashSetTest {
    public static void main (String args[]) {
        HashSet hs = new HashSet();
        Scanner in=new Scanner(System.in);
        while(true){
            System.out.println("请输入用户名：");
           String username=in.next();
           System.out.println("请输入密码：");
           String password=in.next();
            User p=new User(username,password);
           if(hs.add(p)){
               System.out.println("添加成功！");
           }else{
               System.out.println("添加失败！");
           }


        }
    }

}
