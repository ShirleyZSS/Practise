package QunLiaoTest;

/**
 * Created by Shirley on 2017/8/24.
 */
public class ChatMain {
   public static void main(String args[]){
       ChatReceiver chatReceiver=new ChatReceiver();
       chatReceiver.start();

       ChatSender chatSender=new ChatSender();
       chatSender.start();


   }
}
