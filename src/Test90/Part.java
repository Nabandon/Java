package Test90;

import java.util.*;

public class Part{
    static final String[] wei = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖", "拾" };
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            StringBuffer sb =new StringBuffer();
            double money = sc.nextDouble();
            int yi = (int) (money / 100000000);
            int wan = (int) ((money - yi * 100000000) / 10000);
            int ge = (int) (money - yi * 100000000 - wan * 10000);
            System.out.print("人民币");
            if (yi != 0) {
                change(yi,sb);
                sb.append("亿");
            }
            if (wan != 0) {
                change(wan,sb);
                sb.append("万");
            }
            if (ge!=0) {
                change(ge,sb);
                sb.append("元");
            }

            int xiaoshu=(int) ((money - yi * 100000000 - wan * 10000-ge+0.001)*100);
            int jiao=xiaoshu/10;
            int fen=xiaoshu%10;
            if (jiao==0&&fen==0) {
                sb.append("整");
            }else {
                if(jiao!=0){
                    sb.append(wei[jiao]).append("角");
                }
                if(fen!=0){
                    sb.append(wei[fen]).append("分");
                }
            }

            System.out.println(sb.toString());
        }

    }
    public static void change(int a,StringBuffer sb) {
        int qian = a / 1000;
        int bai = (a - qian * 1000) / 100;
        int shi = (a - qian * 1000 - bai * 100) / 10;
        int ge = a - qian * 1000 - bai * 100 - shi * 10;

        if (qian != 0) {
            sb.append(wei[qian] + "仟");
        }
        if (bai != 0) {
            sb.append(wei[bai] + "佰");
        } else if (qian != 0 && bai == 0 && (shi != 0 || ge != 0)) {
            sb.append("零");
        }
        if (shi != 0&&shi!=1) {
            sb.append(wei[shi] + "拾");
        }
        if (shi==0 && bai != 0 && ge != 0) {
            sb.append("零");
        }
//        if(shi==1&&qian==0&&bai==0){
////            sb.append("拾");
////        }
        if(shi==1&&(qian!=0 || bai!=0)){
            sb.append(wei[shi]).append ("拾");
        }
        if (ge != 0) {
            sb.append(wei[ge]);
        }

    }
}