package Exercise;

import java.util.Scanner;

public class Se {
    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            for (int j = 0; j < 10; j++) {
                if (i == 3) {
                    break;
                }
                System.out.println(i+""+j);
                i++;
            }
        }
    }
}
