class Solution {
    public void nextPermutation(int[] nums) {
  int n=nums.length;
  int maxIdx=-1;
  //finding last peak element 
  for(int i=1;i<n;i++)
  { 
    if(nums[i]>nums[i-1])
    maxIdx=i;
  }
  //checking whether the array is strictly decreasing 
  if(maxIdx==-1)
  Arrays.sort(nums);
  //swapping the element with next smaller element 
  else 
  { 
    int index=maxIdx;
   for(int i=maxIdx;i<n;i++)
   { 
     if(nums[i]>nums[maxIdx-1]&&nums[i]<nums[maxIdx])
     index=i;
   }
    int t=nums[maxIdx-1];
    nums[maxIdx-1]=nums[index];
    nums[index]=t;
  //sorting the elements after maxIdx 
    Arrays.sort(nums,maxIdx,n);
  
  }
  
  
      
  
    }
}
