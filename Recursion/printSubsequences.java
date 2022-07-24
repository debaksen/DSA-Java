import java.util.*;

class printSubsequences {
  public static void main(String args[]) {
    int[] arr = { 1, 2, 3 };
    List<Integer> res = new ArrayList<Integer>();
    printSubseq(arr, 0, res);
  }

  public static void printSubseq(int[] arr, int idx, List<Integer> res) {

    if (idx >= arr.length) {
      System.out.println(res);
      return;
    }

    res.add(arr[idx]); // take
    printSubseq(arr, idx + 1, res);
    res.remove(res.size() - 1); // take x
    printSubseq(arr, idx + 1, res);
  }
}