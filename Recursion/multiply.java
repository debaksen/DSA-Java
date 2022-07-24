class multiply{
  public static void main(String[] args){
    System.out.println(multiply(5,3));
  }

  public static int multiply(int val, int times){
    if(times == 1) return val;
    return val + (multiply(val,times-1));
  }
}