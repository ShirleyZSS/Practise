package QunLiaoTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by Shirley on 2017/8/24.
 */
public class ChatReceiver extends Thread{
    @Override
    public void run() {
        try {
            DatagramSocket socket=new DatagramSocket(9090);
            byte[] buf=new byte[1024];
            DatagramPacket packet=null;
            boolean flag=true;
            while(flag){
                packet=new DatagramPacket(buf,buf.length);
                socket.receive(packet);
                System.out.println(packet.getAddress().getHostAddress()+"："+new String(buf,0,packet.getLength()));
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
