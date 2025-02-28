import java.util.Scanner;
public class Strongnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter = ");
        int n=sc.nextInt();
        int temp=0,sum=0;
        temp=n;
        while(temp>0){
            int d=temp%10;
            int fact=1;
            for(int i=d;i>=1;i--){
                fact=fact*i;
            }
            sum+=fact;
            temp/=10;
        }
        if(sum==n){
            System.out.print(n+" is a strong num");
        }
        else{
           System.out.print(n+" is not strong num");
        }
    }
    
}