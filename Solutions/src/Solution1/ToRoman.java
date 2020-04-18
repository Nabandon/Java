package Solution1;

public class ToRoman {
    public int romanToInt(String s) {
        int res=0;
        int get=getInt(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int next=getInt(s.charAt(i));
            if(get<next){
                res-=get;
            }else{
                res+=get;
            }
            get=next;
        }
        return res+get;

    }
    private int getInt(char c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default :return 0;
        }
    }
    //
    private int[] arr={1000,900,500,400,100,90,50,40,10,9,5,4,1};
    private String[] str={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    StringBuilder sb=new StringBuilder();
    public String intToRoman(int num) {
        for(int i=0;i<arr.length;i++){
            while(num>=arr[i]){
                sb.append(str[i]);
                num-=arr[i];
            }
            if(num<=0){
                break;
            }
        }
        return sb.toString();
    }

}
