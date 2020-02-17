package Test100;

public class Atoi {
    public int myAtoi(String str){
        if(str==null||str.length()==0)  return 0;
        int i=0;
        while(i<str.length()&&str.charAt(i)==' '){
            i++;
        }
        if(i==str.length())  return 0;
        int flat=1;
        if(str.charAt(i)=='-'){
            flat=-1;
            i++;
        }else if(str.charAt(i)=='+'){
            flat=1;
            i++;
        }
        else if((str.charAt(i)<='9'&&str.charAt(i)>='0')){
            flat=1;
        }
        int res=0;
        for(;i<str.length() ;i++){
            if(str.charAt(i)<'0'||str.charAt(i)>'9'){
                break;
            }
            res=res*10+str.charAt(i)-'0';
             if(flat==1&&(i+1)<str.length()&&res>Integer.MAX_VALUE/10
                      &&str.charAt(i+1)>='0'&&str.charAt(i+1)<='9')
                 return Integer.MAX_VALUE;
             if(flat==1&&(i+1)<str.length()&&res==Integer.MAX_VALUE/10
                      &&str.charAt(i+1)-'0'>Integer.MAX_VALUE%10&&str.charAt(i+1)<='9')
                 return Integer.MAX_VALUE;
             if(flat==-1&&(i+1)<str.length()&&-res<Integer.MIN_VALUE/10
                      &&str.charAt(i+1)>='0'&&str.charAt(i+1)<='9')
                 return Integer.MIN_VALUE;
             if(flat==-1&&(i+1)<str.length()&&-res==Integer.MIN_VALUE/10
             &&-(str.charAt(i+1)-'0')<Integer.MIN_VALUE%10&&str.charAt(i+1)<='9'&&str.charAt(i+1)>='0')
                 return Integer.MIN_VALUE;

        }
        return res*flat;
    }
}
