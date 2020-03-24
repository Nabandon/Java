package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()) {
            String str = scanner.nextLine();
            StringBuilder strb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char tem = str.charAt(i);
                if (!strb.toString().contains(tem + "")) {
                    strb.append(tem);
                }
            }
            System.out.println(strb.toString());
        }
    }
}
