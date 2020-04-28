package Solution1;

import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args){
        for(int i=0;i<3;i++){
            for(int j=0;j<5;j++){
                if(i==j || i==4-j){
                    System.out.print("v");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}