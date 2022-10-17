class Solution {
    
        public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        Stream.of(items1, items2)
                .flatMap(Stream::of)
                .forEach(item -> map.put(item[0], map.getOrDefault(item[0], 0) + item[1]));

        return map.entrySet().stream()
                .map(entry -> List.of(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    
    }
}
