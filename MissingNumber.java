import java.util.*;
public class MissingNumber {
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
        System.out.println("Missing Number: "+MissingNum(arr));
        
    }
    public static int MissingNum(int[] arr)
    {
        int i=0,temp=0,res=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if(arr[i]<=arr.length && arr[i]!=arr[correct])
            {
                temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else    
                i++;
        }
        for(int k=0;k<arr.length;k++)
        {
            if(arr[k]!=k+1)
                res=k;
        }
        return res;
    }
}
