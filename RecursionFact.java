import java.util.*;
public class RecursionFact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Num=sc.nextInt();
        int res=Factorial(Num);
        System.out.println("Factorial Of given Number is: "+res);
    }
    static int Factorial(int Num)
    {
        int fact=1;
        if(Num==0)
            return 1;
        else    
            return Num*Factorial(Num-1);
    }
}
