INPUT : 5 3 2 4 1
OUTPUT: 8

import java.util.*;


public class Main
{
    public static int merge(int[] a,int left,int mid,int right)
    {
        int ic=0;
        int[] temp=new int[a.length];
        int i=left,j=mid,k=left;
        while(i<=mid-1 && j<=right)
        {
            if(a[i]<=a[j])
            {
                temp[k++]=a[i++];
            }
            else
            {
                temp[k++]=a[j++];
                ic+=(mid-i);
            }
        }
        while(i<=mid-1)
        {
            temp[k++]=a[i++];
        }
        while(j<=right)
        {
            temp[k++]=a[j++];
        }
        for(i=left;i<=right;i++)
        {
            a[i]=temp[i];
        }
        return ic;
    }
    public static int mergeSort(int[] a,int left,int right)
    {
        int ic=0;
        if(right>left)
        {
            int mid=(left+right)/2;
            ic+=mergeSort(a,left,mid);
            ic+=mergeSort(a,mid+1,right);
            
            ic+=merge(a,left,mid+1,right);
        }
        return ic;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();
		}
		int ic=0;
		System.out.print(mergeSort(a,0,n-1));
	}
}
