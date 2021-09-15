package day12.test2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {
    public static void main(String[] args) throws IOException {
        //获取ip地址(本机)
        //如果没有飞Q 怎么获取别人的ip地址/主机名
        InetAddress localHost = InetAddress.getByName("DESKTOP-F5I610V");
       // System.out.println(localHost);

        //发送端创建ds(数据发送/接收器)不用设置端口号参数
        DatagramSocket ds = new DatagramSocket();

        //操作文件数据传输都要创建字节byte数组，通过该数组搭载信息给接收端接收
        //把文件数据放进字节数组中

        //把文件路径放进字符串中   (文件大小最大为64K)
      //  String absolutePath = new File("C:\\Users\\86135\\Desktop\\21070723d52cd034727c8841c7d97b3.png").getAbsolutePath();


        //大于64Kb文件(不行， dp 只能搭载64kb大小的包 )
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\86135\\Desktop\\21070723d52cd034727c8841c7d97b3.png"));


        //小于64kb文件(发给老师发送 成功)
       // BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\86135\\Desktop\\笔记.txt"));


        byte[] bytes = new byte[1024 * 8]; // 8192
        //通过字节输入输出流的形式把文件路径写入数组中
        bis.read(bytes);

      //  int read = new FileInputStream(absolutePath).read(bytes);


        //发送端创建dp需要提供好多参数：字节数组,数组开始索引：设为0 (可以不写)， 字节数组长度，
        // ip地址，端口号(端口号接收端和发送端的要一致)
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, localHost, 8888);

        ds.send(dp);

        ds.close();

    }
}
