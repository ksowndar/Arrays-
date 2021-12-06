class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return (nums[nums.length-k]);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        System.out.print("K'th largest element is " + findKthLargest(arr, k));
    }
}
