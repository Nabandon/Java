package Exercise;

public class StringMatch {
    public static void main(String[] args) {
        String a="abc";
        String b="cabcabca";
        System.out.println(repeatedStringMatch(a,b));
    }
    public static int repeatedStringMatch(String A, String B) {
       for(int i=0;i<A.length();i++){
           if(A.charAt(i)==B.charAt(0)){
               int count=1;
               int j=i;
               int k=0;
               while (A.charAt(j)==B.charAt(k)){
                   j++;
                   k++;
                   if(k==B.length()){
                       return count;
                   }
                   if(j==A.length()){
                       j=0;
                       count++;
                   }

               }
           }
       }
       return -1;
    }
}
