class firstOcc{
  public static void main(String[] args){
    int[] arr = {1,2,6,5,7,8,7,9,12,0,7};
    System.out.println(findFirst(arr,7,0));
  }

  public static int findFirst(int[] arr, int val,int currIdx){

    if(currIdx == arr.length) return -1;

    if(arr[currIdx] == val) return 0;

    int subIndex = findFirst(arr,val,currIdx+1);
    if(subIndex != -1) return 1 + subIndex;

    return -1; 
  }

  
}