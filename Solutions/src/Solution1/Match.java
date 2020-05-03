package Solution1;



import javafx.scene.control.skin.SliderSkin;

import java.lang.reflect.Array;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left = null;
    TreeNode right = null;
    TreeNode next = null;

    TreeNode(int val) {
        this.val = val;
    }
}
public class Match {


    ArrayList<Integer> list = new ArrayList<>();

    public void Insert(Integer num) {
        list.add(num);
    }

    public Double GetMedian() {
        int s = list.size();
        if (s==1){
            return  (double)list.get(0);
        }
        Collections.sort(list, (o1, o2) -> o1 - o2);

        if (s % 2 != 0) {
            return (double) list.get((s / 2));
        }
        return (double) (list.get((s / 2) - 1) + list.get(s / 2))/2;
    }
}