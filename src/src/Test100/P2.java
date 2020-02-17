package Test100;

public class P2 {
    public boolean isP(int x){
        int res=0;
        while(x>res){
            res=res*10+x%10;
            x/=10;
        }
        return x==res||x==res/10;
    }
}
