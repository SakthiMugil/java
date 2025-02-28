import java.util.Scanner;
    public class automarphic1 {
        public static void main(String[] args) {
            System.out.print("Enter the value:"); 
    
        Scanner a=new Scanner(System.in);
        int n= a.nextInt();
        int h=n*n;
        boolean var=true;
        while(n>0){
        if(n%10!=h%10){
           var=false;
           break;
        }
        n/=10;
        h/=10;
            
    }
    if(var){
        System.out.println("t");
    }
    else{
        System.out.println("f");

    }

    }
}