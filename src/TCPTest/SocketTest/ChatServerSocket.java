package TCPTest.SocketTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Shirley on 2017/8/24.
 */
public class ChatServerSocket {
    public static void main(String args[]) throws IOException {
        ServerSocket serverSocket=new ServerSocket(9090);
        Socket socket=serverSocket.accept();
        InputStream inputStream=socket.getInputStream();
        byte[] buf=new byte[1024];
        int length=inputStream.read(buf);
        System.out.println("服务端收到了："+new String (buf,0,length));

        OutputStream outputStream=socket.getOutputStream();
        outputStream.write("你好客户端".getBytes());
        serverSocket.close();
    }
}
