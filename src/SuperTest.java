import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by Shirley on 2017/9/1.
 * 方法的重写
 */

class Student1{
    String name;
    public Student1(String name){
        this.name=name;
    }
    public void study(){
        System.out.println(name+"学生在学习。。。");
    }
}

class P1 extends Student1{
    public P1(String name){
        super(name);
    }
    public void study(){
        System.out.println(name+"普通学生在学马克思列宁主义。。。");
    }
}

class P2 extends  Student1{
    public P2(String name){
        super(name);
    }
    public void study(){
        System.out.println(name+"基础班学生在学习javase...");
    }
}

class P3 extends Student1{
    public P3(String name){
        super(name);
    }
    public void study(){
        System.out.println(name+"就业班学生在学习javase+andriod");
    }
}
public class SuperTest {
    public static void main(String[] args){
        Student1 student1=new Student1("小明");
        student1.study();
        P1 p1=new P1("小红");
        p1.study();
        P2 p2=new P2("小黄");
        p2.study();
        P3 p3=new P3("小李");
        p3.study();

    }
}
