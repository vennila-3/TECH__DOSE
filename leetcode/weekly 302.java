class Solution {
    public int[] numberOfPairs(int[] nums) {
        
        var counts = new HashMap<Integer, Integer>();
        Arrays.stream(nums).forEach(n -> counts.merge(n, 1, Integer::sum));
        
        var result = new int[2];
        
        for (int count: counts.values()) {
            result[0] += count / 2;    
            result[1] += count % 2;
        }
        return result;
    }
}
