package Solution007;


import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        for(int i = 0;i < count;i++){
            arr[i] = sc.nextInt();
        }
        int[][] res=getIndex(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(res[i][0]+" "+res[i][1]);
        }
    }
    private static int[][] getIndex(int[] arr){
        Stack<Integer> stack=new Stack<>();
        int[][] in=new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]>arr[i]){
                int now=stack.pop();
                int left=stack.isEmpty()?-1:stack.peek();
                in[now][0]=left;
                in[now][1]=i;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int now=stack.pop();
            int left=stack.isEmpty()?-1:stack.peek();
            in[now][0]=left;
            in[now][1]=-1;
        }
        return in;
    }
}




