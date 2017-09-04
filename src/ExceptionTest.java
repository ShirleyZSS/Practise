/**
 * Created by Shirley on 2017/9/4.
 * 自定义异常类i进行抛出或捕获处理
 */
class MyException extends Exception{
    public MyException(String name){
        super(name);
    }
}

public class ExceptionTest {
    public static void main(String args[]){
        double money=9;
        try{
            eatFood(money);
        }catch (MyException e){
            e.printStackTrace();
            System.out.println("回家拿钱");
        }

    }

    public static void eatFood(double money)throws MyException{
        if(money<10.0){
            throw new MyException("钱没有带够...");
        }
        System.out.println("钱带够了，可以吃上香喷喷的木桶饭了...");
    }
}
