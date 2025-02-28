import java.util.Scanner;
public class HarshadNumber {
    
 static boolean harh(int n){
        int temp=n;
         int b=0;
        while(temp>0){
          int num=temp%10;
            b+=num;
            temp/=10;
        }
        if(n%b==0){
        return true;
        }
        else{
        return false;
            }    }

    static void harsh1(){
        Scanner c= new Scanner(System.in);
         int n1=c.nextInt();
         int n2 =c.nextInt();
         for(int i=n1;i<=n2;i++){
            if(harh(i))
           System.out.println(i);
         }
        }
    public static void main(String[]args){
        harsh1();
    }
}

