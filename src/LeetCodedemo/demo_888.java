package LeetCodedemo;


/**
 * @Author xuansama
 * @Date 2021/2/1 - 9:31 下午
 */
    class Solution {
        public int[] fairCandySwap(int[] A, int[] B) {
        int aSum = 0, bSum = 0;
        for (int i : A) aSum += i;
        for (int i : B) bSum += i;
        int total = aSum + bSum;
        int target = total / 2;
        int dif = target - aSum;
        int[] ans = new int[2];
        for (int i : A) {
            if (result(B, i + dif)) {
                ans[0] = i;
                ans[1] = i + dif;
                break;
            }
        }
        return ans;
    }

    boolean result(int[] nums, int target) {
        for (int i : nums) {
            if (i == target) {
                return true;
            }
        }
        return false;
    }
}
