class Solution {
    public boolean equalFrequency(String str) {
        int l = str.length();
 
        // fill frequency array
        int[] freq = new int[26];
 
        for (int i = 0; i < l; i++)
            freq[str.charAt(i)-'a']++;
 
        /*  Try decreasing frequency of all character
            by one and then check all equality of all
            non-zero frequencies */
        for (char c = 'a'; c <= 'z'; c++) {
            int i = c-'a';
 
            // Check character only if it occurs in str
            if (freq[i] > 0) {
                freq[i]--;
 
                if (allSame(freq, 26))
                    return true;
                freq[i]++;
            }
        }
 
        return false;
    }
    
     private boolean allSame(int freq[], int N)
    {
        int same = 0;
 
        // get first non-zero element
        int i;
        for (i = 0; i < N; i++) {
            if (freq[i] > 0) {
                same = freq[i];
                break;
            }
        }
 
        // check equality of each element with
        // variable same
        for (int j = i + 1; j < N; j++)
            if (freq[j] > 0 && freq[j] != same)
                return false;
 
        return true;
    }
}
