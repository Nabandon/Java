class Test31{
    public static void main(String[] args){
        int n=1024;
         print(n);
    }
    public static void  print(int n){
        
        if(n>9){
             print(n/10);
        }
          System.out.print(n%10+" ");
    }
}