import java.lang.*;
import java.util.*;
class Main{
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6,7,8};
        int k=4;
        ArrayList<Integer> al=ConstantWindow(arr,k);
        System.out.println(al+" ");
    }
    
    //SlidingWindow
    static ArrayList<Integer> ConstantWindow(int[] arr,int k){
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length-k;i++){
            int sum=0;
            for(int j=i;j<i+k;j++){
                sum=sum+arr[j];
            }
            al.add(sum);
        }
        return al;
    }
}
