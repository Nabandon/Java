public class QW{
    public static void main(String[] args) {
        int year;{
       for(year=1000;year<=2000;year++){
            if((year%100!=0&&year%4==0)||year%400==0)
            System.out.println(year);
       }
     }
   }
}