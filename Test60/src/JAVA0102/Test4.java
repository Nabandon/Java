package JAVA0102;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
class Person{
    public String name="san";
    public int age=10;
}
class Test4 {
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.name);
        System.out.println(person.age);
    }
}
