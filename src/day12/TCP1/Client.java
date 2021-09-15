package day12.TCP1;

/*
* 客户端
*
* 实现与服务器互通对话
* */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        //客户端 socket对象 提供指向服务器的ip地址和端口号
        //127.0.0.1 回环ip 指向自身
        Socket socket = new Socket("127.0.0.1",8888);


        //********************************************************
        //客户端向服务器端发送一句话: 发送用字节输出流
        OutputStream os = socket.getOutputStream();

        //创建要写的话的字节数组
        byte[] bytes = "服务器你好啊，我这边是客户端".getBytes();

        //通过字节数组写出
        os.write(bytes);

        //*******************************************************
       //接收客户端发送的消息
        InputStream is = socket.getInputStream();

        //设置接收语句的字节数组  //接收时需要设置字节数组来存储数据，一搬为【1024 * 8】
        //如果字节数组长度过长：打印时不设置长度和初始位置， 会出现大量空格
        //如果字节数组长度过短，打印时会出现乱码接收不完全。  -->   服务器�
        byte[] arr = new byte[1024];

        //提取数组长度
        int len = is.read(arr);

        //接收的数据放在字节数组中， 需转换成字符串打印
        System.out.println(new String(arr,0,len));

        //******************************************
        //流用完需要关流
        os.close();
        is.close();
        //关闭客户端
        socket.close();


    }
}
