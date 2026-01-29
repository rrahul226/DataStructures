import java.util.Scanner;
public class QuickSort {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int N=sc.nextInt();
        int[] arr=new int[N];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        int left=0,right=arr.length-1;
        Partition(arr,left,right);
        System.out.print("Sorted Array is: ");
        for(int Num:arr)
        {
            System.err.print(Num+" ");
        }
    }

    static void Partition(int[] nums,int low,int high)
    {
        if(low>=high)
        {
            return;
        }
        int s=low;
        int e=high;
        int mid=(low+high)/2;
        int pivot=nums[mid];
        int temp=0;
        while(s<=e)
        {
            while(nums[s]<pivot)
            {
                s++;
            }
            while(nums[e]>pivot)
            {
                e--;
            }
            if(s<=e)
            {
                temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        Partition(nums, low, e);
        Partition(nums, s, high);
    }
}
