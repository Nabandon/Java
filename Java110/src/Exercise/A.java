package Exercise;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class A<T> {
    T value;

    A(T value) {
        this.value=value;
    }

    T get() {
        return value;
    }

    public static void main(String[] args) {
        A<Integer> a=new A<>(10);
        int v=a.get();
        System.out.println(v);
    }

}
