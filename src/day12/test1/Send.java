package day12.test1;

import java.io.IOException;
import java.net.*;

public class Send {
    public static void main(String[] args) throws IOException {

        //获取本机的本机名和Ip地址
        System.out.println(InetAddress.getLocalHost());

        //通过主机名获取它的ip地址信息
      //  System.out.println(InetAddress.getByName(""));
        //无法通过ip地址获取主机名
       // System.out.println(InetAddress.getByName("192.168.19.56"));
        //可以通过(本地)主机名获得ip地址
        // System.out.println(InetAddress.getByName("hejielongdeMacBook-Pro.local"));


        //创建发送器
        DatagramSocket ds = new DatagramSocket();

        //创建数据采集器(中转站)   DatagramPacket(字节数据数组,字节数据数组长度,接收端的ip地址,接收端的端口号)
                                //     DatagramPacket(byte[], [].length,InerAddress.getLocalHost,port)

        //数据采集器
        DatagramPacket dp = new DatagramPacket("你好啊".getBytes(),0, 1024,InetAddress.getLocalHost() , 8888);

        ds.send(dp);

        ds.close();
    }
}
