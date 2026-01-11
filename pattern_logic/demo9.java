package pattern_logic;

public class demo9 {
    public static void main(String[] args) {
        int ro=4;
    for(int i=1;i<=ro;i++){
       for(int j=1;j<=ro-i;j++){
         System.out.print(" ");
       }
       int star=(2*i)-1;
       for(int j=1;j<=star;j++){
        System.out.print("*");
       }
       System.out.println();
    }  
    for(int i=ro;i>=1;i--){
       for(int j=1;j<=ro-i;j++){
         System.out.print(" ");
       }
       int star=(2*i)-1;
       for(int j=1;j<=star;j++){
        System.out.print("*");
       }
       System.out.println();
    }  

   } 
}