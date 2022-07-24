import java.util.*;

// Only prints the subsequence who's value equals to X 
class printSubseqEqualsX {
  public static void main(String args[]) {
    int[] arr = { 1, 2, 1 };
    List<Integer> res = new ArrayList<Integer>();
    int reqSum = 2; 
    printSubseq(arr,res,0,0,reqSum);
  }

  public static void printSubseq(int[] arr,List<Integer> res,int idx,int sum, int reqSum) {

    if (idx >= arr.length) {
      if(sum == reqSum){
        System.out.println(res);
      }
      return;
    }

    res.add(arr[idx]); // take
    sum+=arr[idx];
    printSubseq(arr, res,idx + 1,sum,reqSum);
    res.remove(res.size() - 1); // take x
    sum-=arr[idx];
    printSubseq(arr, res,idx + 1,sum,reqSum);
  }
}