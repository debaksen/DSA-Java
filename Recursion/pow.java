class pow{
  public static void main(String[] args){
    System.out.println(computePow(2,8));
  }

  public static int computePow(int val, int power){
    if(power == 1) return val;

    else{
      return val * computePow(val,power-1); 
    }
  }
}