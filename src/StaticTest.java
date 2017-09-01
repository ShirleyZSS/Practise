/**
 * Created by Shirley on 2017/8/31.
 * 记录该类被创建了多少个对象
 */
class Student{
    String name;
    String sex;
    static int count=0;
    {
        count++;//构造代码块
    }

    public Student(String name,String sex){
        this.name=name;
        this.sex=sex;
    }

    public Student(){

    }

}

public class StaticTest {

    public static void main(String args[]){
        Student s1=new Student("赵姗姗","女" );
        System.out.println(Student.count);
        Student s2=new Student("赵姗姗","女" );
        System.out.println(Student.count);
        Student s3=new Student("赵姗姗","女" );
        System.out.println(Student.count);
        Student s4=new Student();
        System.out.println(Student.count);

    }
}
