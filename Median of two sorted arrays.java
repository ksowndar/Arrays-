
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
Example 3:

Input: nums1 = [0,0], nums2 = [0,0]
Output: 0.00000


class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
        int m=nums1.length,n=nums2.length,i=0,j=0,k=0;
         int[] res=new int[m+n];
        while(i<m && j<n)
        {
            if(nums1[i]<nums2[j])
            {
                res[k]=nums1[i];
                i++;
            }
            else
            {
                res[k]=nums2[j];
                j++;
            }
            k++;
        }
        if(i>=m)
        {
            while(j<n)
            {
                res[k]=nums2[j];
                j++;
                k++;
            }
        }
        else
        {
            while(i<m)
            {
                res[k]=nums1[i];
                i++;
                k++;
            }
        }
        double sum=0;
        for(int d=0;d<res.length;d++)
            System.out.print(res[d]+" ");
        if(res.length%2==0)
        {
            int mid=res.length/2;
            sum=(double)(res[mid]+res[mid-1])/2;
        }
        else
        {
            sum=res[res.length/2];
        }
        return sum;
    }
}

    
