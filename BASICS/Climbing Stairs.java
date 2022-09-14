class Solution {
public int climbStairs(int n) {

  int cp = climb(n, new int[n+1]);
  return cp;
   
}
public static int climb(int n , int[] strg){
if(n == 0){
return 1;
} else if(n < 0){
return 0;
}

if(strg[n] != 0){
  return strg[n];
}


int first  = climb(n-1, strg);
int sec = climb(n-2,strg);
 
int res = first + sec ;


strg[n] = res;

return res;
}
}
