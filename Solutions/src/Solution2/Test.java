package Solution2;


import java.util.*;


public class Test {
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        int n=sca.nextInt();
        int m=sca.nextInt();
        int t1=0,t2=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] a=new int[m+n];
        int[] b=new int[m];
        for(int i=0;i<n;i++){
            t1=sca.nextInt();
            t2=sca.nextInt();
            a[i]=t1;
            map.put(t1,t2);
        }
        for(int i=0;i<m;i++){
            t1=sca.nextInt();
            b[i]=t1;
            a[n+i]=t1;
            if(!map.containsKey(t1)){
                map.put(t1,0);
            }
        }
        Arrays.sort(a);
        int max=0;
        for(int i=0;i<m+n;i++){
            max=Math.max(max,map.get(a[i]));
            map.put(a[i],max);
        }
        for(int i=0;i<m;i++){
            System.out.println(map.get(b[i]));
        }
    }
}
