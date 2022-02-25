package Assignment3;
import java.util.*;

public class SubsetInteger {
    public static void main(String[] args) {
        int[] a = {1, 2 ,3};
        System.out.println(subsets(a));
    }
    public static List<List<Integer>>  subsets(int[] a){
           List<List<Integer>> res = new ArrayList<>();
           List<Integer> cu = new ArrayList<>();
            res(res, cu, a,0);
            return res;
        }
     public static void res(List<List<Integer>> res, List<Integer> cu,int[] a, int p){
        if(cu.size() > a.length) return;
        res.add(new ArrayList<>(cu));
        for (int i = p; i< a.length; i++){
            cu.add(a[i]);
            res(res, cu, a, i+1);
            cu.remove(cu.size() -1);
        }
    }
}
