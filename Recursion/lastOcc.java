class lastOcc{
  public static void main(String[] args){
    int[] arr = {1,2,6,5,7,8,7,9,12,0,8,7,6,5,3,2};
    System.out.println(findLast(arr,7,arr.length-1));
  }

  public static int findLast(int[] arr, int val,int currIdx){
  if(currIdx < 0) return -1;
  if(arr[currIdx] == val) return arr.length-1;

  int lastIndex = findLast(arr,val,currIdx-1);
    if(lastIndex != -1) return lastIndex - 1; 

    return -1; 
  }

  
}