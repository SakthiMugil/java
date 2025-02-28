public class diamondsymbol {
    public static void main(String[] args) {
        int  n=4;
            for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    if( i+j==2 || i*j==3 ||i+j==6 ||i==2||j==2)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                System.out.println();
            }
            
    }
    
}
