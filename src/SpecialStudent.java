import java.security.PublicKey;

/**
 * Created by Shirley on 2017/9/2.
 * 继承与实现
 */
class Student2{
    String name;
    public Student2(String name){
        this.name=name;
    }
    public void study(){
        System.out.println(name+"好好学习");
    }
}
//拓展功能定义在接口中
interface Money{
    public void makeMoney();
}
public class SpecialStudent extends Student2 implements Money{
    public SpecialStudent(String name){
        super(name);
    }

    public static void main(String[] args){
        SpecialStudent s=new SpecialStudent("小明");
        s.study();
        s.makeMoney();

    }

    @Override
    public void makeMoney() {
        System.out.println(name+"好好挣钱");

    }
}
