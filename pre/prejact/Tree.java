package prejact;

public class Tree {
    public long tree1 (int[] a) {
        // write code here
        int len=a.length;
        long res=0;
        for(int i=0;i<len;i++){
            int parent=i;
            int son=parent*2+1;
            if(son<len){
                res+=(a[parent]^a[son]);

            }else{
                break;
            }
            if(son+1<len){
                res+=(a[parent]^a[son+1]);
            }else{
                break;
            }
        }
        return res;
    }
}
