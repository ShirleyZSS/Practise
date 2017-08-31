/**
 * Created by Shirley on 2017/8/31.
 */
class Student{
    String name;
    String sex;
    static int count=0;

    public Student(String name,String sex){
        this.name=name;
        this.sex=sex;
        count++;
    }
}

public class StaticTest {

    public static void main(String args){
        Student s1=new Student("赵姗姗","女" );
        System.out.println(Student.count);
        Student s2=new Student("赵姗姗","女" );
        System.out.println(Student.count);
        Student s3=new Student("赵姗姗","女" );
        System.out.println(Student.count);

    }
}
