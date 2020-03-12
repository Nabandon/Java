package Test222;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        ListNode arr=new ListNode(0);


    }


        public String defangIPaddr(String address) {
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < address.length(); i++) {
                if (address.charAt(i) == '.') {

                    s.append("[.]");
                } else {
                    s.append(address.charAt(i));
                }
            }
            return s.toString();
        }
    }



