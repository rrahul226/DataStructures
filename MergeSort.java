import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Numbers How many elements U need: ");
        int Num=sc.nextInt();
        int[] arr=new int[Num];
        System.out.println("Enter Elements: ");
        for(int i=0;i<Num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int low=0,high=arr.length-1;
        Sorting(arr,low,high);
        System.out.print("Sorted Elements are: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    static void Sorting(int[] arr,int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            Sorting(arr,low,mid);
            Sorting(arr,mid+1,high);
            Merge(arr,low,mid,high);
        }
    }
    static void Merge(int[] arr,int low,int mid,int high)
    {
        int i=low;
        int j=mid+1;
        int k=0;
        int[] Merge=new int[high-low+1];
        while(i<=low && j<=high)
        {
            if(arr[i]<arr[j])
            {
                Merge[k++]=arr[i++];
            }
            else{
                Merge[k++]=arr[j++];
            }
        }
        while(i<=mid)
        {
            Merge[k++]=arr[i++];
        }
        while(j<=high)
        {
            Merge[k++]=arr[j++];
        }
        for(int x=0;x<Merge.length;x++)
        {
            arr[low+x]=Merge[x];
        }
    }
}
