class Solution {
    public List<Integer> findAnagrams(String s, String p) {
     int i=0,idx=0;
     int n=s.length();
     int k=p.length(); 
   char c[]=p.toCharArray();   //creating char array for sorting purpose
     Arrays.sort(c);
    List<Integer> l=new ArrayList<>(); 
  for(i=0;i<=n-k;i++)
  { 
   String sub=s.substring(i,i+k); //forming substring
   char ch[]=sub.toCharArray();  //converting substring to char array for sorting purpose
   Arrays.sort(ch);
   if(Arrays.equals(c,ch)) //checking if the given p string equals substring
   l.add(i);
   }  
   return l;
   
    }
}
