package TCPTest.SocketTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by Shirley on 2017/8/24.
 */
public class ChatSocket {
    public static void main(String args[]) throws IOException {
        Socket socket=new Socket(InetAddress.getLocalHost(),9090);
        OutputStream outputStream=socket.getOutputStream();
        outputStream.write("服务端你好".getBytes());

        InputStream inputStream=socket.getInputStream();
        byte[] buf=new byte[1024];
        int length=inputStream.read(buf);
        System.out.println("客户端收到的数据："+new String(buf,0,length));

        socket.close();


    }
}
