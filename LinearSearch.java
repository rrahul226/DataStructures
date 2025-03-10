import java.util.Scanner;
public class LinearSearch {
    static boolean Search(int[] arr,int target ) {
		int N=arr.length;
		int index;
		if(N==0)
		{
			return false;
		}
		for(index=0;index<N;index++)
		{
			int element=arr[index];
			if(element==target)
			{
				return true;
			}
		}
		return false;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No.of Elements you have to take: ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		int i;
        System.out.print("Enter Elements: ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
        System.out.print("Enter the Search Element whether the element is present or Not: ");
		int target=sc.nextInt();
		boolean res=Search(arr,target);
		if(res)
		{
			System.out.println("-------------Element is Found--------------");
		}
		else {
			System.out.println("-------------Element is Not Found-----------");
		}
        sc.close();
	} 
}
