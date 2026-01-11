package pattern_logic;

public class demo11 {
    public static void main(String[] args) {
        int no=4;
        for(int i=1;i<=no;i++){    //(2*i)-1  
            int test= (2*i)-1;
            for(int j=1;j<=test;j++){  
                if(j%2!=0){
                    System.out.print(i);
                }  
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=no;i>=1;i--){      
            int test= (2*i)-1;
            for(int j=1;j<=test;j++){  
                if(j%2!=0){
                    System.out.print(i);
                }  
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
