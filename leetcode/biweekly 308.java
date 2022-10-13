class Solution {
   public int[] answerQueries(int[] nums, int[] q) {
    Arrays.sort(nums);
	int[] res = new int[q.length];
    for(int i = 0; i<q.length; i++) {
        int sum = 0, j = 0;
        for(j=0; j<nums.length; j++) {
            if(sum+nums[j]>q[i]){
                res[i] = j;
                break;
            }
            sum = sum+nums[j];
        }
        if(j==nums.length) res[i] = j;
    }
    return res;
}
}
