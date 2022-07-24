import java.util.*;

class printSubseqEqualsX {
  public static void main(String args[]) {
    int[] arr = { 1, 2, 1,2,0 };
    List<Integer> res = new ArrayList<Integer>();
    int reqSum = 2; 
    //1 printSubseq(arr,res,0,0,reqSum);
    //2printOneSubseq(arr,res,0,0,reqSum);
    System.out.println(countAllSubseqEqualX(arr,res,0,0,reqSum));
  }

  // 1. Only prints the subsequences who's value equals to X 
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

  // 2. Print only one subsequence* who's value equals to X 
  public static Boolean printOneSubseq(int[] arr,List<Integer> res,int idx,int sum, int reqSum) {

    if (idx >= arr.length) {
      if(sum == reqSum){
        System.out.println(res);
        return true;
      }
      return false;
    }

    res.add(arr[idx]); // take
    sum+=arr[idx];
    if(printOneSubseq(arr, res,idx + 1,sum,reqSum) == true) {return true;}
    res.remove(res.size() - 1); // take x
    sum-=arr[idx];
    if(printOneSubseq(arr, res,idx + 1,sum,reqSum) == true) {return true;}

    return false;
  }
  
// 3. Count all subsequence* who's value equals to X 
   public static int countAllSubseqEqualX(int[] arr,List<Integer> res,int idx,int sum, int reqSum)   {

    if (idx >= arr.length) {
      if(sum == reqSum){
        return 1; 
      }
      return 0;
    }

    res.add(arr[idx]); // take
    sum+=arr[idx];
    int cntWithEle = countAllSubseqEqualX(arr, res,idx + 1,sum,reqSum);
    res.remove(res.size() - 1); // take x
    sum-=arr[idx];
    int cntWithOutEle = countAllSubseqEqualX(arr, res,idx + 1,sum,reqSum);

    return cntWithEle + cntWithOutEle; 
  }
}