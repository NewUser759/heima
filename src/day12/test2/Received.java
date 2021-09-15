package day12.test2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Received {
    public static void main(String[] args) throws IOException {
        //接收端创建接收器（ds）需要提供端口号参数
        DatagramSocket ds = new DatagramSocket(8888);

        //相当于连接的船
        byte[] bytes = new byte[1024];


        //接收端创建dp数据包需要提供接收数据的数组，数组长度
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        //接收数据
        ds.receive(dp);




        //以下代码为查看接收的文件

        //把字节数组中的数据转换为字符串
        String s = new String(bytes);

        System.out.println(s);
        //把字符串转化为路径


        ds.close();
    }
}
