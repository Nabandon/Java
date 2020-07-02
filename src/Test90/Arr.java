package Test90;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.ArrayList;

public class Arr{
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            String str=sca.next();
            if(str.length()<=8){//长度
                System.out.println("NG");
            }else{
                HashMap<Integer,Boolean> map=new HashMap<>();
                boolean b=true;
                for(int i=0;i<str.length();i++){
                    if(i<str.length()-3){//是否重复
                        String q=str.substring(i,i+3);
                        String h=str.substring(i+3);
                        if(h!=null && h.contains(q)){
                            b=false;
                            break;
                        }
                    }
                    char c=str.charAt(i);//种类够否
                    if(c<='9' && c>='0'){
                        map.put(1,true);
                    }else if(c<'z' && c>'a'){
                        map.put(2,true);
                    }else if(c<'Z' && c>'A'){
                        map.put(3,true);
                    }else{
                        map.put(4,true);
                    }
                }
                int co=map.size();
                if(co>=3 && b){
                    System.out.println("OK");
                }else{
                    System.out.println("NG");
                }
            }
        }
    }
}


