package QunLiaoTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Created by Shirley on 2017/8/24.
 */
public class ChatSender extends Thread {
    @Override
    public void run() {
        try {
            DatagramSocket socket = new DatagramSocket();
            //从控制台读取数据
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            DatagramPacket packet=null;
            String line=null;
            while((line=bufferedReader.readLine())!=null){
                packet=new DatagramPacket(line.getBytes(),line.getBytes().length, InetAddress.getByName("192.168.1.255"),9090);//主机号为255是广播IP地址
                socket.send(packet);
            }
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
