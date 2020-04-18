package Solution1;

public class ToRoman {
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
