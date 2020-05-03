package Interview;


import java.util.*;

//每个输入包含一个测试用例。
//每个测试用例的第一行包含两个正整数，分别表示工作的数量N(N<=100000)和小伙伴的数量M(M<=100000)。
//接下来的N行每行包含两个正整数，分别表示该项工作的难度Di(Di<=1000000000)和报酬Pi(Pi<=1000000000)。
//接下来的一行包含M个正整数，分别表示M个小伙伴的能力值Ai(Ai<=1000000000)。
//保证不存在两项工作的报酬相同。
//输入
//3 3
//1 100
//10 1000
//1000000000 1001
//9 10 1000000000
//输出
//复制
//100
//1000
//1001
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
