import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeMap;

/**
 * Created by Shirley on 2017/8/14.
 * 定义一个TreeMap 键存储书，根据书的出版日期排序
 */

class Book1 implements Comparable{
    String name;
    Date date;
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
    public Book1(String name, Date date) {
        super();
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "{书名："+this.name+"出版日期："+simpleDateFormat.format(this.date)+"}";
    }

    @Override
    public int compareTo(Object o) {
        Book1 b=(Book1)o;
        return this.date.compareTo(b.date);
    }
}
public class TreeMapTest {
    public static void main(String args[]){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        TreeMap<Book1,String> treeMap=new TreeMap<Book1,String>();
        try {
            treeMap.put(new Book1("无线传感器网络",simpleDateFormat.parse("2011-01-01")),"001");
            treeMap.put(new Book1("矩阵论",simpleDateFormat.parse("2011-02-01")),"002");
            treeMap.put(new Book1("信号与信息处理",simpleDateFormat.parse("2001-02-01")),"003");
            treeMap.put(new Book1("现代交换原理",simpleDateFormat.parse("2017-02-01")),"004");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(treeMap);

    }



}
