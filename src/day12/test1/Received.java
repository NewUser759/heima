package day12.test1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Received {
    public static void main(String[] args) throws IOException {
        //接收端端口要与发送端一致
        DatagramSocket ds = new DatagramSocket(8888);

        //提供任意(与发送端一致的数组长度)
        byte[] arr = new byte[1024];

        //接收端的数据采集器 只需要创建接收数据的数组和提供数组长度就可以
        DatagramPacket dp = new DatagramPacket(arr,arr.length);

        //接收数据
        ds.receive(dp);

        //查看数据， 把字节数组转成字符串输出打印
        System.out.println(new String(arr));

        ds.close();

    }
}
