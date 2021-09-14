package day12.TCP1;

/*
*
* 服务器
* */

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Sever {
    public static void main(String[] args) throws IOException {
        //服务器 seversocket对象,提供端口号
        ServerSocket ss = new ServerSocket(8888);

        //接收连接
        Socket socket = ss.accept();    //会阻塞

        //******************************************************
        //创建字节输入流接收客户端发的语句
        InputStream is = socket.getInputStream();


        //创建读取的字节数组
        byte[] bytes = new byte[1024];

        //通过输入流读取 --> 接收结果为字节数组
        // -->提取数组长度用于输出在控制台
        int len = is.read(bytes);

        //打印接收的数据
        //此处输出需要有字节数组的开始位置和数组长度不然会显示空字符
        System.out.println(new String(bytes,0,len));


        //*****************************************************
        //通过客户端发送一句话给服务器
      //  OutputStream os = socket.getOutputStream();

      //  os.write("客户端你好，欢迎使用".getBytes());

        //*****************************************************
        //关流
     //   os.close();
        is.close();
        socket.close();
    }
}
