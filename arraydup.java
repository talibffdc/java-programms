public class arraydup {

    public static void main(String[] args) {
        String str = "Talib";
        int o=1;

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println(" Duplicate" + " " + str.charAt(j));
                    

                } else {
                    
                    System.out.println("not duplicate");
                    break;
                }
                
            }
            
        }
        
    }
}