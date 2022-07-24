class binarySearch {
  public static void main(String[] args) {
   // Binary Search Using Recursion 
   int[] arr = {1,2,5,7,9,13};
    binarySearch(arr,0,arr.length-1,13);
  }

  public static void binarySearch(int[] arr, int lo, int hi, int ele){
    int mid = (lo + hi)/2;
    if(arr[mid] == ele) {
      System.out.println("Element found at "+mid);
      return; 
    }
    else if(arr[mid] > ele){
      binarySearch(arr,lo,mid-1,ele);
    }
    else{
      binarySearch(arr,mid+1,hi,ele);
    }
  }
  
}