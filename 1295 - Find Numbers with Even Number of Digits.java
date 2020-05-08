class Solution {
	public int findNumbers(int[] nums) {
		int count = 0;
		for (int n: nums) {
			if (n >= 10 && n<9999) {
				if (!(n > 99 && n<= 999)) {
					count++;
				}
			}
		}
		return count;
	}
}
