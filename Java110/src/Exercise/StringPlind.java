package Exercise;

public class StringPlind {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("-100");
        String m=String.valueOf(-100);
        System.out.println(String.valueOf(m)+s);
    }
    public static String convertToBase7(int num) {
        if(num<7&&num>-7) return String.valueOf(num);
        StringBuilder str=new StringBuilder();
        int n=Math.abs(num);
        while(n>0){
            str.append(n%7);
            n/=7;
        }
        return num>0?str.reverse().toString() : str.append("-").reverse().toString();
    }
}
