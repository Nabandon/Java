package Test90;

public class ThreePart {
    public boolean canThreePartsEqualSum(int[] A) {

            int add_up=0;
            for(int x:A) {
                add_up+=x;
            }
             if(add_up%3!=0){
                return false;
            }
             int one_third=add_up/3;
             int l_sum=0,r_sum=0;
            for(int left=0;left<A.length-2;left++){
                l_sum+=A[left];
                if(l_sum==one_third ){
                    for(int right=left+1;right<A.length-1;right++){
                        r_sum+=A[right];
                        if(r_sum==one_third){
                            return true;
                        }
                    }
                    return false;
                }
            }
            return false;
        }
    }

