package l;

public class er_geshu{
    public static void main(String[] args) {
        System.out.println(1001%100);
        System.out.println(countNumberOf2s(30));
    }
    public static int countNumberOf2s(int n) {
        // write code here
        if(n<2){
            return 0;
        }
        if(n<12){
            return 1;
        }
        int count=0;
        int l=0;
        int c=0;
        int h=0;
        int flag=1;
        while (n/flag>0){
            l=n-(n/flag)*flag;
            c=(n/flag)%10;
            h=n/(flag*10);
            if(c<2){
                count+=h*flag;
            }
            if(c==2){
                count+=h*flag+l+1;
            }
            if(c>2){
                count+=(h+1)*flag;
            }
            flag*=10;
        }


        return count;
    }
}

