package Solution1;

import Solution2.TreeNode;

import java.util.*;


public class Java_0402 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        res.add(new ArrayList<>());
        int len=nums.length;
        for(int i=0;i<len;i++){
            int size=res.size();
            for(int j=0;j<size;j++){
                List<Integer> temp=new ArrayList<>(res.get(j));
                temp.add(nums[i]);
                res.add(temp);
            }
        }
        return res;
    }

}
