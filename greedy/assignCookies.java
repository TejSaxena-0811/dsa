package greedy;

// assign cookies

// leetcode 455






// optimized: (tc: O(nlogn) , sc: O(1))
// here we are actually being GREEDY to solve this problem. by sorting both arrays, we make sure that the small greed factor child gets only that cookie that is enough to satisfy it. for example, if greed factor is 1, we are not giving it a cookie of size 4 (wasting 3 sizes here), we only give him/her a cookie size of 1 or the element strictly greater than 1.
import java.util.Arrays;
public class assignCookies {
    public static void main(String[] args) {
        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};

        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;

        int count = 0;

        while(i < g.length && j < s.length){
            if(s[j] >= g[i]){
                count++;
                i++;
            }
            j++;
        }

        System.out.println(count);
    }
}
