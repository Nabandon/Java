package Solution1;

public class Java {
    public static void main(String[] args) {
        String s="Bob. hIt, baLl";
        String[] e={"bob", "hit"};
StringBuilder stringBuilder=new StringBuilder();
stringBuilder.append(s.charAt(0));
String b=stringBuilder.toString();
        System.out.println(b);
       System.out.println(MostCommonword.mostCommonWord(s,e));
    }
}
