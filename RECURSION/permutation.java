class Solution {
   static List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans=new ArrayList<>();
        recpermut(nums,0);
        return ans;
    }
 
   static void recpermut(int[] nums,int ind)
   {
      if(ind==nums.length)          //base case
      { ArrayList<Integer> dp=new ArrayList<>();
          for(int i=0;i<nums.length;i++)
          dp.add(nums[i]);
          ans.add(dp);
          return;
      }
       for(int i=ind;i<nums.length;i++)
       {
         swap(i,ind,nums);
         recpermut(nums,ind+1);      //recursion hypothesis
          swap(i,ind,nums);
       }
   }
    static void swap(int i,int j,int nums[])
    {
      int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
    }
