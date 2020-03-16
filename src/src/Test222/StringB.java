package Test222;

import java.util.*;

public class StringB {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        String[] list=new String[1000];
        int k=0;
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    list[ k++]= list1[i];
                }
            }
        }

        return Arrays.copyOfRange(list,0,k);
        
    }

    public static void main(String[] args) {
        String[] list1={"a","b","c"};
        String[] list2={"a","v","m"};
        System.out.println(findRestaurant(list1,list2));
    }

}
