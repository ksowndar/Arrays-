Leetcode:

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]
Example 3:

Input: nums = [0]
Output: [0]
Example 4:

Input: nums = [1]
Output: [1]

class Solution {
    public void sortColors(int[] nums) {
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
                max=nums[i];
        }
        int[] count=new int[max+1];
        for(int i=0;i<=max;i++)
            count[i]=0;
        for(int i=0;i<nums.length;i++)
        {
            count[nums[i]]++;
        }
        int[] b=new int[nums.length];
        for(int i=1;i<=max;i++)
        {
            count[i]=count[i]+count[i-1];
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            b[--count[nums[i]]]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=b[i];
        }
    }
}
