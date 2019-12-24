public class Test12{
    public static void main(String[] args) {
        int i,j,k;
        for(i=1;i<10;i++){
            for(j=1;j<=i;j++){
                k=i*j;
                System.out.printf(i+"*"+j+"="+k+" ");
            }System.out.printf("\n");
        }
    }
}