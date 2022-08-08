public class patternrectangle {

    public static void main(String [] args){

        int row=5;
        int column=4;

        for(int i=1; i<=4; i++){

            for(int j=1; j<=5; j++){
                if(i==1 || j==1|| i==column || j==row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
    
}
