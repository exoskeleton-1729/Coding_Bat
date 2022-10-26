public int[] reverse3(int[] nums) {
	int [] reversed = new int[3];
	for(int i = 2; i >= 0; i--)
	{
		reversed[2-i] = nums[i];
	}
	return reversed;
}