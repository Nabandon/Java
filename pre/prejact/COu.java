package prejact;

public class COu {
    public String solve (int n, int[] a) {
        // write code here
        int minIn=0;
        for(int i=1;i<9;i++){
            if(a[i]<=a[minIn]){
                minIn=i;
            }
        }
        int ct=n/a[minIn];
        if(ct==0){
            return "-1";
        }
        StringBuilder str=new StringBuilder();
        int d;
        n-=ct*a[minIn];
        while(n>0 && ct>0){
            d=minIn;
            for(int i=minIn+1;i<9;i++){
                if(a[i]-a[minIn]<=n){
                    d=i;
                }
            }
            if(d==minIn){
                break;
            }else{
                str.append((d+1));
            }
            ct--;
            n-=a[d]-a[minIn];
        }
        for(int i=0;i<ct;i++){
            str.append((minIn+1));
        }
        return str.toString();
    }
}
