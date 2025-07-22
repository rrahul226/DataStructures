import java.util.*;
public class SkipAChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        System.out.print("Enter a Skip Character: ");
        char c=sc.next().charAt(0);
        String p_s="";
        System.out.print("After Skipping Character: "+SkipCharacter(str,c,p_s));
    }
    static String SkipCharacter(String str,char c,String p_s)
    {
        if(str.isEmpty())
        {
            return p_s;
        }
        if(str.charAt(0)==c)
        {
            return SkipCharacter(str.substring(1), c, p_s);
        }
        else{
            return SkipCharacter(str.substring(1),c,p_s+str.charAt(0));
        }
    }
}
