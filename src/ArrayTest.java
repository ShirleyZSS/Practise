import sun.management.BaseOperatingSystemImpl;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.prefs.BackingStoreException;

/**
 * Created by Shirley on 2017/8/11.
 * 编写一个函数清楚集合中的重复元素，书号一致视为重复元素
 */

class Book{
    int id;
    String name;

    public Book(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        Book b = (Book) obj;
        if (b.id == this.id)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "id:"+this.id+"书名："+this.name;
    }
}
public class ArrayTest {
    public static void main(String args[]){
        ArrayList list=new ArrayList();
        ArrayList newList=new ArrayList();
        list.add(new Book(110,"java编程思想"));
        list.add(new Book(220,"java核心技术"));
        list.add(new Book(330,"深入javaweb"));
        list.add(new Book(110,"java神书"));
        list.add(new Book(110,"C语言"));
        list.add(new Book(440,"C语言"));

       /* for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(((Book)list.get(i)).id==((Book)list.get(j)).id){
                    list.remove(j);
                }

            }
        }*/
        ListIterator it=list.listIterator();
        while(it.hasNext()){
            Book b=(Book)it.next();
            if(newList.contains(b)){
                continue;
            }else{
                newList.add(b);

            }
        }

        System.out.println(newList);



    }



}
