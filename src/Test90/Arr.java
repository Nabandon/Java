package Test90;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Arr{
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            int n=sca.nextInt();
            int    po=(int)Math.pow(n,2);
            int m=0;
            int pf=po;
            while(pf/10>0){
                m++;
                pf/=10;
            }
            m=po%((int)Math.pow(10,m));
            if(m==n){
                System.out.println("Yes!");
            }else{
                System.out.println("No!");
            }
        }
    }
}


