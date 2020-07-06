package l;

import java.util.*;

public class easyJiLu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();//LinkedHashMap而不是hashmap！！！！！
        String key;
        String filename;
        String path;
        while(in.hasNext()){
            path = in.next();
            //将路径转换为文件名
            int id = path.lastIndexOf('\\');
            //如果找不到说明只有文件名没有路径
            filename = id<0  ? path : path.substring(id+1);
            int linenum = in.nextInt();
            //统计频率
            key = filename+" "+linenum;
            map.put(key,map.getOrDefault(key,0)+1);
        }
        in.close();
        List<Map.Entry<String ,Integer>> list=new LinkedList<>(map.entrySet());
        Collections.sort(list,((o1, o2) -> o2.getValue()-o1.getValue()));

//        List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(map.entrySet());
//        Collections.sort(list,new Comparator<Map.Entry<String, Integer>>(){
//            //降序
//            @Override
//            public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
//                return(arg1.getValue()-arg0.getValue()) == 0? (arg0.getValue()-arg1.getValue()) : (arg1.getValue()-arg0.getValue());
//            }
//        });

        int m=0;
        for(Map.Entry<String, Integer> mapping : list){
            m++;
            if(m<=8){
                String[] str = mapping.getKey().split(" ");
                String k = str[0].length()>16 ? str[0].substring(str[0].length()-16) : str[0];
                String n = str[1];
                System.out.println(k+" "+n+" "+mapping.getValue());
            }else{
                break;
            }
        }
    }
}
