class Solution {
    public int countEven(int num) {
        
	int sum = num % 10 + (num / 10) % 10 + (num / 100) % 10 + (num / 1000) % 10;

	// Check the parity of the digit sum of the last number
	return (num - (sum & 1)) / 2;
}
    
}
