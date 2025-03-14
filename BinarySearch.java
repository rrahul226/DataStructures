import java.util.*;
public class BinarySearch {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.of Elements you want: ");
        int Num=sc.nextInt();
        int[] arr=new int[Num];
        System.out.print("Enter Elements: ");
        for(int i=0;i<Num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Target: ");
        int tar=sc.nextInt();
        sc.close();
        int result=Search(arr,tar);
        System.out.println("Element is found at "+result);
    }
    static int Search(int[] arr,int target)
    {
        int low=0,high=arr.length,mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==target)
                return mid;
            else if(target>arr[mid])
                low=mid+1;
            else
                high=mid-1;
        }
        return mid;
    }
}
