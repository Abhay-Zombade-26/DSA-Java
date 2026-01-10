package pattern_logic;

public class demo7 {
    public static void main(String[] args) {                                                                                                                                                                       
        int row=4;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){ 
                System.out.print("*");
            }                                                                              
            int test=2*(row-i);
            for(int j=1;j<=test;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            int test=2*(row-i);
            for(int j=1;j<=test;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
