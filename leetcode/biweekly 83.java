class Solution {
     public String bestHand(int[] r, char[] s) {
        int[] cnt = new int[14];
        IntStream.of(r).forEach(i -> ++cnt[i]);
        int max = IntStream.of(cnt).max().getAsInt();
        if (s[0] == s[1] && s[1] == s[2] && s[2] == s[3] && s[3] == s[4]) {
            return "Flush";
        }else if (max >= 3) {
            return "Three of a Kind";
        }else if (max == 2) {
            return "Pair";
        }else {
            return "High Card";
        }
    
        
    }
}
