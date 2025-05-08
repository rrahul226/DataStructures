import java.util.Scanner;
public class CyclicSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.Of Elements: ");
        int N=sc.nextInt();
        System.out.println("Enter Elements between range from 1 to N: ");
        int[] arr=new int[N];
        for(int i=0;i<N;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("After Sorting: ");
        Sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    static void Sort(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct])
            {
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else
                i++;
        }
    }
}
