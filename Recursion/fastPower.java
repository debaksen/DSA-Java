class fastPower{
  public static void main(String[] args){
    System.out.println(fastPower(2,20));
  }

  public static int fastPower(int n,int pow){
  // Base case
    if(pow == 0) return 1;

    // Recursive case
    int calcVal = fastPower(n,pow/2);
    calcVal *= calcVal;

    if(pow%2 == 0) return calcVal;
    return calcVal * n; 
  }
}