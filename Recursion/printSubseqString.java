class printSubseqString{
  public static void main(String[] args){
    String str = "abc";
    printPermute(str,"");
  }

  public static void printPermute(String str, String ans){
     if(str.length() == 0) {
       System.out.println(ans);
       return;
     }
    for(int i=0;i<str.length();i++){
      char ch = str.charAt(i); // b
      String abs = str.substring(0,i)+str.substring(i+1); // ac
      printPermute(abs,ans+ch);
    }
  }
  public static void printSubSeq(String str, String ans){ 
    
    if(str.length() == 0) {
      System.out.println(ans);
      return;
    }
      char ch = str.charAt(0); // a 
      str = str.substring(1);// bc
     // System.out.println(str);
      printSubSeq(str,ans);  
      printSubSeq(str,ans+ch);
  }
}