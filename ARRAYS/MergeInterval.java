class Solution {
    public int[][] merge(int[][] intervals) { 
     Arrays.sort(intervals,(a,b)->a[0]-b[0]);
    List<int[]> list=new ArrayList<>();
  for(int[] i:intervals) 
  { 
   int start=i[0];
   int end=i[1];
   if(list.size()==0||list.get(list.size()-1)[1]<start)
   list.add(i);
 else 
   { 
    list.get(list.size()-1)[1]=Math.max(list.get(list.size()-1)[1],end);
   }
      
  }
    return list.toArray(new int[0][0]);    
    }
}
