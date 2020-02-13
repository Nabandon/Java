package Test2;

public class FindMadianArr {
    public double findMedianSortedArrays(int[] A,int[] B){
        int la=A.length;
        int lb=B.length;
        if(la<lb){
            int[] temp= A;
            A=B;
            B=temp;
            int temp2=la;
            la=lb;
            lb=temp2;
        }
        int aMin=0;
        int aMax=la;
        int halfLen=(la+lb+1)>>1;
        while(aMin<=aMax){
            int aIndex=(aMin+aMax)>>1;
            int bIndex=halfLen-aIndex;
            if(aIndex>aMin&&A[aIndex-1]>B[bIndex]){
                aMax=aIndex-1;
            } else if(aIndex<aMax&&B[bIndex-1]>A[aIndex]){
                aMin=aIndex+1;
            }else{
                int leftpart=0;
                if(aIndex==0){
                    leftpart=B[bIndex-1];
                }else if(bIndex==0){
                    leftpart=A[la-1];
                }else{
                    leftpart=Math.max(A[aIndex-1],B[bIndex-1]);
                }
                if((la+lb)%2==1){
                    return leftpart;
                }
                int rightpart=0;
                if(aIndex==la){
                    rightpart= B[bIndex];
                }else if(bIndex==lb){
                    rightpart=A[0];
                }else{
                    rightpart=Math.min(A[aIndex],B[bIndex]);
                }
                return (leftpart+rightpart)/2.0;
            }
        }
        return 0;
    }
}
