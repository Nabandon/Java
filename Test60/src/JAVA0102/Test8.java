package JAVA0102;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

class TD{
    public int a;
    public static int count;
    public static void change(){
        count=10;
    }
}
public class Test8 {
    public static void main(String[] args) {
        TD.change();
        System.out.println(TD.count);
    }
}
