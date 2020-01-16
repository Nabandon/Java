package Java0112;

public class SortedSquares {
    public int[] sortedSquares(int[] A){
        int[] copyA=new int[A.length];
        for(int i=0;i<A.length;i++){
            copyA[i]=A[i]*A[i];
        }
        for(int a=0;a<A.length;a++){
            for(int b=A.length-1;b>a;b--){
                if(copyA[b]<=copyA[a]){
                    int tmp=copyA[a];
                    copyA[a]=copyA[b];
                    copyA[b]=tmp;
            }
        }
        }return copyA;
    }

}
