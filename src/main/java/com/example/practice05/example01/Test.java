package com.example.practice05.example01;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    private static void getByteStreams() throws IOException {
        //输入流
        FileInputStream in = new FileInputStream("C:/input.text");
        //输出流

        FileOutputStream out = new FileOutputStream("C:/input.text");
        int c;
        while ((c = in.read()) != -1){
            System.out.println("读取字节的十进制数：" + c);
            out.write(c);
        }
        //输入流输出流必须关闭资源！！！！！
        in.close();
        out.close();
    }

}
