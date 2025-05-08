import java.util.Scanner;
public class MissingNum {
    public static void main(String[] args) {
        System.out.println("Enter No.Of Elements to array: ");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println("Enter Elements: ");
        int[] arr=new int[N];
        for(int j=0;j<N-1;j++)
        {
            arr[j]=sc.nextInt();
        }
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct])
            {
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }
            else    
                i++;
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j)
                System.out.println(j);
        }
    }
}
