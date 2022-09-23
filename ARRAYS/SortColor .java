class Solution {
    public void sortColors(int[] nums) {
   int n=nums.length;
   int r=n-1,l=0,mid=0;
   while(mid<=r)
   { 
     if(nums[mid]==0)
     { 
       int t=nums[mid];
       nums[mid]=nums[l];
       nums[l]=t; 
       l++;mid++;
     } 
     else if(nums[mid]==2)
     { 
       int t=nums[mid];
       nums[mid]=nums[r];
       nums[r]=t;
       r--;
     } 
    else
     mid++;
   }
    }
}
