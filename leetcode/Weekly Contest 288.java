class Solution {
    public int largestInteger(int num) {
        char[] arr = Integer.toString(num).toCharArray();

        PriorityQueue < Character > odd = new PriorityQueue();
        PriorityQueue < Character > even = new PriorityQueue();

        for (char c: arr) {
            if (c % 2 == 0) {
                even.offer(c);
            } else {
                odd.offer(c);
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = arr[i] % 2 == 0 ? even.poll() : odd.poll();
        }

        return Integer.parseInt(new String(arr));
    }
}
