import java.util.*;
public class BinarySearchRecursive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.of Elements U Need: ");
        int Num=sc.nextInt();
        int[] arr=new int[Num];
        System.out.print("Enter Elements: ");
        for(int i=0;i<Num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Key: ");
        int key=sc.nextInt();
        int left=0,right=arr.length-1;
        int res=RecBinarySearch(arr,left,right,key);
        if(res!=-1)
            System.out.println("Element is found at Pos is: "+res);
        else
            System.out.println("Element is not found  ");
    }
    static int RecBinarySearch(int[] arr,int left,int right,int key)
    {
        int mid=(left+right)/2;
        int sol=0;
        if(left>right)
            return -1;
        if(arr[mid]==key)
        {
            return mid;
        }
        else if(key<arr[mid])
        {
            return RecBinarySearch(arr, left, mid-1, key);
        }
        else
        {
            return RecBinarySearch(arr,mid+1,right,key);
        }
    }
}
