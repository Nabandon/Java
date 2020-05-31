package io;

import org.junit.Test;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class IO_test {
    @Test
    public void t1(){
    File file=new File("F:\\Java\\Solutions\\ww.txt");
     //   System.out.println(file.exists());
       File f2=new File("../Solutions/ww.txt");
     //   System.out.println(f2.exists());
        File f3=new File(".");
        System.out.println(f3.getAbsolutePath());
    }
    @Test
    public void t2(){
        File f5=new File("F:\\Java");
        File[] child=f5.listFiles();
        for(File c:child){
            System.out.println(c.getName());
        }
    }
    @Test
    public void t3(){
        File f6=new File("F:\\Java");
        List<File> c=list(f6);
        for(File f:c){
            System.out.println(f.getName());
        }
    }
    public static List<File> list(File file){
        List<File> l=new ArrayList<>();
        if(file.isFile()){
            l.add(file);
        }else {
            File[] child= file.listFiles();
            for(File f:child){
                List<File> subs=list(f);
                l.addAll(subs);
            }
        }
        return l;
    }
}
