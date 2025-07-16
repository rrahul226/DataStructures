import java.util.*;
class KadaneAlg
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.of Elements: ");
        int Num=sc.nextInt();
        int[] arr=new int[Num];
        System.out.print("Enter Array Elements: ");
        for(int i=0;i<Num;i++)
        {
            arr[i]=sc.nextInt();
        }
        int maxsum=0,currentsum=0;
        currentsum=arr[0];
        maxsum=arr[0];
        for(int i=1;i<Num;i++)
        {
            currentsum=Math.max(arr[i],currentsum+arr[i]);
            maxsum=Math.max(maxsum,currentsum);
        }
        System.out.println("Maximum SubArray Sum: "+maxsum);
    }
}
