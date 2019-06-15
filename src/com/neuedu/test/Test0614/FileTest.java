package com.neuedu.test.Test0614;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        //声明一个输入流
        FileInputStream fis = null;
        //声明一个输出流
        FileOutputStream fos = null;

        File file = new File("G:\\temp\\file.txt");
        try {
            file.createNewFile();
            fis = new FileInputStream(file);

            fos = new FileOutputStream("G:\\temp\\files.txt");

            byte[] words = new byte[10240];
            while ((fis.read(words)) != -1) {
                fos.write(words, 0, words.length);//写入数据
            }
            System.out.println("文件数据复制成功！！！！！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (fis != null) {

                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {

                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }
    }
}
