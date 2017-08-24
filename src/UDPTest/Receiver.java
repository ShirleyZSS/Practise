package UDPTest;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by Shirley on 2017/8/24.
 */
public class Receiver {
    public static void main(String args[]) throws IOException {
        DatagramSocket socket=new DatagramSocket(9090);
        //准备空数据包装数据
        byte[] buf=new byte[1024];
        DatagramPacket packet=new DatagramPacket(buf,buf.length);
        socket.receive(packet);
        socket.close();
        System.out.println("接收到了数据："+new String(buf,0,packet.getLength()));

    }
}

