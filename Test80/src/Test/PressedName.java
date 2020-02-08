package Test;

public class PressedName {
    public boolean pressedName(String name,String typed){
        int j=0;
        for(char c: name.toCharArray()){
            if(j==typed.length())
                return false;
            if(typed.charAt(j)!=c){
                if(j==0||typed.charAt(j-1)!=typed.charAt(j))
                    return false;
                char cur=typed.charAt(j);
                while(j<typed.length()&&typed.charAt(j)==cur)
                    j++;
                if(j==typed.length()||typed.charAt(j)!=c)
                    return false;
            }
            j++;
        }
        return true;
    }
}
