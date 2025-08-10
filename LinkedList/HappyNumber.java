import java.util.*;
public class HappyNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int Num=sc.nextInt();
        if(Number(Num)){
            System.out.println("Happy Number");
        }
        else{
            System.out.println("Not Happy Number");
        }
    }

    static boolean Number(int n)
    {
        int slow=n;
        int fast=n;
        do{
            slow=SqOfNum(slow);
            fast=SqOfNum(SqOfNum(fast));
        }while(slow!=fast);
        if(slow==1){
            return true;
        }
        return false;
    }
    static int SqOfNum(int n)
    {
        int rem=0,ans=0;
        while(n!=0){
            rem=n%10;
            ans+=rem*rem;
            n=n/10;
        }
        return ans;
    }

}
