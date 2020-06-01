package io;

import org.junit.Test;

import java.io.*;

public class FileIO {
    @Test
    public void t7() throws IOException {
        InputStream fis = null;
        try {
            fis = this.getClass().getClassLoader().getResourceAsStream("../Solutions/ww.txt");
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                String s = new String(bytes, 0, len);
                System.out.println(s);
            }
        }finally {
            if(fis!=null)
            fis.close();
        }
    }
    @Test
    public void t8() throws IOException {
        FileReader reader=new FileReader("F:\\Java\\Solutions\\ww.txt");
        char[] chars=new char[1024];
        int len;
        while((len=reader.read(chars))!=-1){
            String s=new String(chars,0,len);
            System.out.println(s);
        }
    }
    @Test
    public void t9() throws IOException {
        FileInputStream fis=new FileInputStream("F:\\Java\\Solutions\\ww.txt") ;
        BufferedInputStream bis=new BufferedInputStream(fis);
        byte[] bytes=new byte[1024];
        int len;
        while((len=bis.read(bytes))!=-1){
            String s=new String(bytes,0,len);
            System.out.println(s);
        }
    }
}
