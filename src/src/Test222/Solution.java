package Test222;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {

        Random random = new Random();
        int guess = random.nextInt(100);
        System.out.println("请输入您猜的数字:");
        int count=0;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num > guess) {
                System.out.println("猜大了!");
                count++;
            } else if (num < guess) {
                System.out.println("猜小了!");
                count++;
            } else {
                System.out.println("恭喜您猜对了!!!");
                System.out.println("您一共猜了"+count+"次");
                return;
            }
        }
    }
}



