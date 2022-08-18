class Solution {
    int min = Integer.MAX_VALUE;

    void solve(int[] nums, int start, int end) {
        if (start > end)
            return;
        int mid = (start + end) / 2;
        min = Math.min(min, nums[mid]);
        if ((mid - 1 >= 0 && nums[mid - 1] < nums[mid]) || (nums[start] < nums[mid])) {
            solve(nums, start, mid - 1);
        }
        if ((mid + 1 < nums.length && nums[mid + 1] < nums[mid]) || (nums[end] < nums[mid])) {
            solve(nums, mid + 1, end);
        }
    }
    public int findMin(int[] nums) {
        solve(nums, 0, nums.length - 1);
        return min;
    }
}