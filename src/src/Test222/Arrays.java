package Test222;
class Arrays{
    public int countLR (int[] a, int[] b) {
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==2*b[i]){
                count++;
            }
        }
        for(int i=0;i<a.length-1;i++){
            int res=a[i];
            for(int j=i+1;j<b.length;j++){
                res+=a[j];
                if(res==b[i]+b[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
