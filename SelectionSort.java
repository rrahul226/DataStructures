import java.util.Scanner;
public class SelectionSort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("No.Of Elements to Sort: ");
        int N=sc.nextInt();
        int[] arr=new int[N];
        System.out.println("Enter Elements: ");
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            int last=arr.length-i-1;
            int first=MaxIndex(arr,last);
            Swap(arr,first,last);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
        sc.close();
    }
    //Finding Maximum Element in the Array
    static int MaxIndex(int[] arr,int last)
    {
        int Max=0;
        for(int i=1;i<=last;i++)
        {
            if(arr[i]>arr[Max])
            {
                Max=i;
            }
        }
        return Max;
    }
    //Swapping the Maximum element with the last element in tha array
    static void Swap(int[] arr,int first,int last)
    {
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
