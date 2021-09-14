package day12.TCP2;


//上传文件的客户端

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        //通过高效字节流传递文件数据，创建高效字节流
        BufferedInputStream bis = new BufferedInputStream
                (new FileInputStream("E:\\HeiMa\\课件\\javaee就业班\\课件\\预习视频11~13\\Day13\\01_视频\\27_动态代理增强String的length方法.wmv"));

        //创建客户端接口,需要指定ip地址和端口号
        Socket socket = new Socket("127.0.0.1",8888);

        //创建客户端的高效输出流连接到服务器
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

        //拷贝
        int b;
        //  while 带有循环判断，while(true)为无限循环
        while ((b = bis.read()) != -1){
                bos.write(b);
        }

        //关流
       bos.close();
        bis.close();
        socket.close();

    }
}
