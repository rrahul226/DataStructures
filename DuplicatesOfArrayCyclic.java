import java.util.*;
public class DuplicatesOfArrayCyclic {
    public static void main(String[] args) {
        System.out.println("Enter No.Of Elements to array: ");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        System.out.println("Enter Elements: ");
        int[] arr=new int[N];
        for(int j=0;j<N;j++)
        {
            arr[j]=sc.nextInt();
        }
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
        System.out.print("Duplicate Number of the array: ");
        ArrayList<Integer> al=new ArrayList<>();
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j+1)
                al.add(arr[j]);
        }
        System.out.println(al);
    }
}
