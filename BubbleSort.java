import java.util.*;
public class BubbleSort {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No: ");
        int Num=sc.nextInt();
        int[] arr=new int[Num];
        System.out.print("Enter Array: ");
        for(int i=0;i<Num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Before Sorting: "+arr);
        for(int i=0;i<Num;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Sort(int[] arr)
    {
        int temp=0;
        boolean swap;
        for(int i=0;i<arr.length;i++)
        {
            swap=false;
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]<arr[j-1])
                {
                    temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
            if(!swap)
            {
                break;
            }
        }
    }
}
