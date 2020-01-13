package Java0112;

public class Test72 {
    public static void main(String[] args) {
        int x=20;
        int y=5;
        System.out.println(x+y+""+(x+y)+y);
    }
    class Suloution{
        public String toLworCase(String str){
                String st="";
            for(int i=0;i<str.length();i++){
                char c=str.charAt(i);
               if(c>=65&&c<=90){
                   c+=32;
               }
               st+=c;
            }
            return st;
        }
    }

}
