package UDPTest;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by Shirley on 2017/8/24.
 */
public class Sender {
    //发送端
    public static void main(String args[]) throws IOException {
        DatagramSocket socket=new DatagramSocket();
        String data="UDP通讯协议！";
        DatagramPacket packet=new DatagramPacket(data.getBytes(),data.getBytes().length, InetAddress.getLocalHost(),9090);
        socket.send(packet);
        socket.close();

    }
}
