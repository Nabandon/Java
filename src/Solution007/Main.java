package Solution007;


import java.util.*;

public class Main {

    static ArrayList<String> list=new ArrayList<>();
    public static void main(String[] args){
        Scanner sca=new Scanner(System.in);
        while(sca.hasNext()){
            list.clear();
            int n=sca.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sca.nextInt();
            }
            Stack<Integer> stack=new Stack<>();
            h(arr,stack,"",0,0);
            Collections.sort(list);
            for(String s:list){
                System.out.println(s);
            }
        }
        sca.close();
    }
    private static void h(int[] arr,Stack stack,String str,int j,int c){
        if(c==arr.length){
            list.add(str);
            return;
        }
        if(c<arr.length && !stack.isEmpty()){
            int t=(int)stack.pop();
            h(arr,stack,str+t+" ",j,c+1);
            stack.push(t);
        }
        if(j<arr.length){
            stack.push(arr[j]);
            h(arr,stack,str,j+1,c);
            stack.pop();
        }
    }
}




