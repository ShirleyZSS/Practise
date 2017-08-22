import java.util.Date;

/**
 * Created by Shirley on 2017/8/22.
 * 装饰者设计模式练习题
 */

//公共接口
interface Work{
    public void work();
}

class Son implements Work{
    @Override
    public void work() {
        System.out.println("画画...");
    }
}

class Mon implements Work{
    Work work;

    public Mon(Work work){
        this.work=work;
    }
    @Override
    public void work() {
        work.work();
        System.out.println("给画上颜色...");
    }
}

class Dad implements Work{
    Work work;
    public Dad(Work work){
        this.work=work;
    }
    @Override
    public void work() {
        work.work();
        System.out.println("给画裱画框...");
    }
}
public class Test2 {
    public static void main(String args[]){
        Son son=new Son();
        Mon mon=new Mon(son);
        Dad dad=new Dad(mon);
        dad.work();


    }
}
