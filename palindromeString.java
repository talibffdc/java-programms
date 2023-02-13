public class palindromeString {

    public static void ispalindrome(String str){
        StringBuilder sb= new StringBuilder(str);

            sb.reverse();
            String rev=sb.toString();
             
            if(str.equals(rev)){
               System.out.println("palindrome");
            
            }
            else {
                System.out.println("not palindorme");

            }

        }

        public static void main(String[] args) {
            String str="hih";
            ispalindrome(str); 

        }
    
    }




