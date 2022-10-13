class Solution {
    public boolean findSubarrays(int[] nums) {
        int arr[] = new int[nums.length-1];
        int j =1;
        for(int i=0; i<nums.length-1; i++){
            arr[i]= nums[i]+nums[j];
            j++;
        }
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i =0; i< arr.length; i++){
            if(h.contains(arr[i])){
                return true;
            }
            h.add(arr[i]);
        }
        return false;
    }
}
