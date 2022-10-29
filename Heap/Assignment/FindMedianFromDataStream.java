class MedianFinder 

{
    private PriorityQueue<Integer> first;
    private PriorityQueue<Integer> second;

    /** initialize your data structure here. */

    public MedianFinder()
    {
        first = new PriorityQueue<>(Collections.reverseOrder());
        second = new PriorityQueue<>();
        first.add(Integer.MIN_VALUE);
        second.add(Integer.MAX_VALUE);
    }

    public void addNum(int num)
    {
        if(num <= first.peek()) first.add(num);
        else second.add(num);

        if(second.size() > first.size()) first.add(second.poll());
        if(first.size() -second.size()>1) second.add(first.poll());
    }
    public double findMedian() 

    {
        if(first.size() > second.size()) return first.peek();
        else return (double)(first.peek() + second.peek())/2;
    }

}
