import java.util.*;
public class SkipAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String Str=sc.nextLine();
        System.out.println("Enter Skip String: ");
        String SkipStr=sc.nextLine();
        String AfterStr="";
        System.out.println("After Skipping a String: "+SkipString(Str,SkipStr));
        
    }
    static String SkipString(String Str,String SkipStr)
    {
        if(Str.isEmpty())
        {
            return "";
        }
        if(Str.startsWith(SkipStr))
        {
            return SkipString(Str.substring(SkipStr.length()),SkipStr);
        }
        else{
            return Str.charAt(0)+SkipString(Str.substring(1),SkipStr);
        }
    }
}
