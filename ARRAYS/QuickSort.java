
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, k);
    }
    private int quickSelect(int[] nums, int start, int end, int k) {
        int pivot = end;
        int i= start;
        int j = end - 1;
        while (i <= j) {
            if (nums[i] > nums[pivot]) {
         int t=nums[i];
         nums[i]=nums[j];
         nums[j]=t;
               j--;
            } 
     else 
           i++;
        }
