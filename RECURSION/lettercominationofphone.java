class Solution {
    public List<String> letterCombinations(String digits) {
        
        
        List<String> res = new ArrayList<>();
        
        if(digits==null || digits==""){
            return res;
        }
        
        Map<Character,String[]> map = new HashMap<>();
        map.put('2',new String[]{"a","b","c"});
        map.put('3',new String[]{"d","e","f"});
        map.put('4',new String[]{"g","h","i"});
        map.put('5',new String[]{"j","k","l"});
        map.put('6',new String[]{"m","n","o"});
        map.put('7',new String[]{"p","q","r","s"});
        map.put('8',new String[]{"t","u","v"});
        map.put('9',new String[]{"w","x","y","z"});
        
            
        solve(map,digits,0,"",res);
        
        return res;

    }
    
    
    public void solve(Map<Character,String[]> map,String input,int ind,String str,List<String> res){
        
        if(ind==input.length()){
            if(str!=""){
                res.add(str);
            }
            return;
        }
        
        String[] s = map.get(input.charAt(ind));
        
        for(int i=0;i<s.length;i++){
            
            solve(map,input,ind+1,str+s[i],res);
            
        }
        
    }
}
