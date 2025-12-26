class Solution {
    public int findGCD(int[] nums) {
       int min = Integer.MAX_VALUE; 
       int max = Integer.MIN_VALUE;

       int n = nums.length;

       for(int i =0 ;i < n; i++){
            if(nums[i] > max)
            max = nums[i];
            if(nums[i] < min)
            min = nums[i];
       }

       return gcd (min,max);
    }

     private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }


}