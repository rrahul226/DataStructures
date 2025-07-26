import java.util.*;
public class NoOfDiceTarget {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int Num=sc.nextInt();
        int[] arr=new int[Num];
        System.out.println("Enter Elements: ");
        for(int i=0;i<Num;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target: ");
        int target=sc.nextInt();
        ArrayList<String> res=Target(arr,target);
        for(String S:res)
        {
            System.out.println("Pairs are: "+S);
        }
    }
    static ArrayList<String> Target(int[] arr,int target)
    {
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(target==arr[i]+arr[j])
                {
                    list.add("("+i+","+j+")");
                }
            }
        }
        return list;
    }
}
