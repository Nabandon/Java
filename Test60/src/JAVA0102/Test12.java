package JAVA0102;
public class Test12 {// 1
    private static int x = 100;// 2
    public static void main(String args[]) {// 3
        Test12 hsl = new Test12();// 4
        hsl.x++;// 5
        Test12 hs2 = new Test12();// 6
        hs2.x++;// 7
        hsl = new Test12();// 8
        hsl.x++;// 9
        Test12.x--;// 10
        System.out.println(" x=" + x);// 11
    }
}