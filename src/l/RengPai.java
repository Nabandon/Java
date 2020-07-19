package l;

public class RengPai {
    public static void main(String[] args) {
        RengPai rengPai=new RengPai();
        System.out.println(rengPai.Orderofpoker("2S8C3D3D6H"));
    }
    public String Orderofpoker (String x) {
        // write code here
        StringBuilder str=new StringBuilder();
        int size=x.length();
        int len=x.length()/2;
        int left=0;
        int right=size-2;
        while(left<=right){
            boolean f=su(len);
            if(f){
                str.append(x.charAt(left)).append(x.charAt(left+1));
                left+=2;
            }else{
                str.append(x.charAt(right)).append(x.charAt(right+1));
                right-=2;
            }
            len--;
        }
        return str.toString();

    }
    private boolean su(int n){
        int z=(int)Math.sqrt(n);
        for(;z>1;z--){
            if(n%z==0){
                return false;
            }
        }
        return true;
    }
}
