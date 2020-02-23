package Test100;

public class Friends2 {
    public int numFriendRequests(int[] ages) {
        int[] count=new int[121];
        for(int age:ages) count[age]++;
        int ans=0;
        for(int a=1;a<=120;a++){
            if(count[a]==0) continue;
            if(a>14) ans+=count[a]*(count[a]-1);
            for(int b=a+1;b<=120;b++){
                if(count[b]==0) continue;
                if (b > 0.5 *a + 7 && b <= a && (b <= 100 || a >=100)) {
                    ans+=count[a]*count[b];
                }
                if (a > 0.5 *b + 7 && a <= b && (a <= 100 || b >=100)) {
                    ans+=count[a]*count[b];
                }
            }
        }
        return ans;
    }
}
