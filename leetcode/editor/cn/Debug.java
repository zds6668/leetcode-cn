package editor.cn;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Five on 2020/8/27 19:04
 */
public class Debug {
    public static void main(String[] args) {
        Solution solution = new Solution();

        ReentrantLock
    }
}
class Solution {
    List<String> res = new LinkedList();
    public List<String> restoreIpAddresses(String s) {
        Thread thread = new Thread();
        backTrack("", res, 0, s);
        return res;

    }

    private void backTrack(String curComb, List<String> list, int index, String last) {
        if (index == 4) {
            list.add(curComb.substring(curComb.length() - 1, curComb.length()));
            return;
        }
        if (index == 3 && last.length() > 3)
            return;
        if (index == 2 && last.length() > 6)
            return;
        for (int i = 0; i < Math.min(3, last.length()); i++) {
            String newComb = last.substring(0, i + 1);
            int tmpi = Integer.parseInt(newComb);
            if ( tmpi<= 255) {
                newComb = curComb + tmpi + ".";
            }
            backTrack(newComb, list, index + 1, last.substring(i, last.length()));
        }

    }
}