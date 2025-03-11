import java.util.Scanner;
public class MInAndMaxEle {
    static void MinElement(int arr[])
    {
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            else if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.print("Minimum Element is: "+min);
        System.out.print("\nMaximum Element is: "+max);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.of Elements you have to take: ");
        int n=sc.nextInt();
        if(n==0)
            System.exit(0);
        int arr[]=new int[n];
        System.out.print("Enter Elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
        MinElement(arr);
        sc.close();
    }
}