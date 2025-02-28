public class hexadecimal { 
    public static void main(String[] args) {
        int n =426;
        int a=0;
        int b=0;
        for(int i=0;i<n;i++){
            a=n/16;
            b=n%16;
        }
        int m=a*10+b;
        
        System.out.print(m);
        
    }
}