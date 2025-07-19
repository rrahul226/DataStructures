import java.util.Scanner;
public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of 1st Array: ");
        int Num1=sc.nextInt();
        System.out.print("Enter Size of 2nd Array: ");
        int Num2=sc.nextInt();
        int[] arr1=new int[Num1];
        int[] arr2=new int[Num2];
        System.out.print("Enter 1st Array Elements: ");
        for(int i=0;i<Num1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter 2nd Array Elements: ");
        for(int i=0;i<Num1;i++)
        {
            arr2[i]=sc.nextInt();
        }
        System.out.println("After Merging given Arrays: ");
        MergeArrays(arr1,arr2);
    }
    public static void MergeArrays(int[] arr1,int[] arr2)
    {
        int[] res=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                res[k++]=arr1[i++];
            }
            else   
                res[k++]=arr2[j++];
        }
        while(i<arr1.length)
        {
            res[k++]=arr1[i++];
        }
        while(j<arr2.length)
        {
            res[k++]=arr2[j++];
        }
        for(int x=0;x<k;x++)
        {
            System.out.print(res[x]+" ");
        }
    }
}
