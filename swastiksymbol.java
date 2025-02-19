public class swastiksymbol {
    public static void main(String[] args) {
        int  n=4;
            for(int i=0;i<=n;i++){
                for(int j=0;j<=n;j++){
                    if((i == 0 && j == 1)||(i == 1 && j == 1)||(i == 1 && j == 3 )||(i == 1 && j == 4 )||
                    (i == 3 && j == 0 )||(i == 3 && j == 1 )||(i == 3 && j == 3 )||(i == 4 && j == 3 ))
                    System.out.print("  ");
                    else
                    System.out.print("* ");
    
            }
        System.out.println();
    }
    }
}

