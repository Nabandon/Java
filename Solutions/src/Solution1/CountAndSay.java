package Solution1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class C {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        while (sca.hasNext()) {
            int n = sca.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                int h = sca.nextInt();
                int m = sca.nextInt();
                arr[i] = h * 60 + m;
            }
            int time = sca.nextInt();
            int schoolH = sca.nextInt();
            int schoolM = sca.nextInt();
            int school = schoolH * 60 + schoolM;
            int min = 0;
            for (int j = 0; j < n; j++) {
                if ((school - arr[j] - time) < 0) {
                    continue;
                } else {
                    if ((school - arr[j] - time) < (school - arr[min] - time)) {
                        min = j;
                    }
                }

            }
            System.out.println(arr[min] / 60 + " " + arr[min] % 60);
        }
    }
}