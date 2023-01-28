public class stringRev {

  public static void main(String[] args) {
    
    String str="Talib";
    String nstr=" ";
    char ch;

     for(int i=0; i<str.length(); i++){

        ch=str.charAt(i);
        nstr= ch+nstr;
     } 
     System.out.println("reverse string" + " " + nstr);

  }
    
}
