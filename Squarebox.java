public class Squarebox {
    public static void main(String args[]){
        int a=6;
        for(int i=0;i<=a;i++){
            for(int j=0;j<=a;j++){
                if(i==0 || i==a ||j==0 ||j==a){
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println(); 
    }     
}
}
     
