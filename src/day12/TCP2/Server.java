package day12.TCP2;


/*
* 上传文件的服务器
*
* 完成
* 可以多次传输
* 可以多线程传输
* */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class Server {
    public static void main(String[] args) throws IOException {

        //服务器创建需要提供端口参数
         ServerSocket ss = new ServerSocket(8888);

         //循环放在阻塞外面
        while (true){

            Socket socket = ss.accept();     //阻塞

            //多线程放在通信成功后    new Thread(()-> {  } ).start
            new Thread(()->{
                try {
                    //socket.getInputStream, 获得和服务器连接的输入流，    bis只是加buff
                    BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());

                    //设置存放的位置 和文件名
                    BufferedOutputStream bos = new BufferedOutputStream
                            (new FileOutputStream("E:\\HeiMa\\javase-code\\out\\artifacts" + UUID.randomUUID() + ".jpg"));
                    //拷贝
                    int b;
                    while ((b = bis.read()) != -1){
                        bos.write(b);
                    }

                    bos.close();
                    bis.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }).start();


        }
    }
}
