 class Solution {
   
    public List<List<Integer>> combinationSum(int[] c, int t) {
     List<List<Integer>> res=new ArrayList<>();
    comb(0,t,c,new ArrayList<>(),res);
    return res;
    }
    static void comb(int ind,int t,int[] a,List<Integer> l,List<List<Integer>> res)
    {
        if(ind==a.length)  //base condition
        {
         if(t==0)
         {
            res.add(new ArrayList<>(l));
         }
         return;
        }
        if(a[ind]<=t)
        {
        l.add(a[ind]);
        comb(ind,t-a[ind],a,l,res);   //pick condition
        l.remove(l.size()-1);
        }

        comb(ind+1,t,a,l,res);   //not pick condition
    }
}
