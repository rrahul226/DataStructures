import java.util.*;
class Main{
    public static void main(String args[]){
        int[] arr={2,5,1,7,10};
        ArrayList<ArrayList<Integer>> al=SubArray(arr);
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }
    
    //LongestSubArray
    
    static ArrayList<ArrayList<Integer>> SubArray(int[] arr){
        ArrayList<ArrayList<Integer>> al=new ArrayList<>();
        for(int i=0;i<arr.length+1;i++){
            for(int j=i;j<arr.length;j++){
                 ArrayList<Integer> il=new ArrayList<>();
                for(int k=i;k<=j;k++){
                    il.add(arr[k]);
                }
                al.add(il);
            }
        }
        return al;
    }
}
