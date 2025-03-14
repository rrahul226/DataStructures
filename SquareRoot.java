import java.util.*;
public class SquareRoot {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Element SquareRoot Number: ");
        int Num=sc.nextInt();
        System.out.print("Square Root of Given "+Num+" is: "+SquareNum(Num));
        sc.close();
    }
    static int SquareNum(int Num)
    {
        int low=0,high=Num,mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if((mid*mid)==Num)
                return mid;
            else if((mid*mid)>Num)
                high=mid-1;
            else
                low=mid+1;
        }
        return mid;
    }
}
