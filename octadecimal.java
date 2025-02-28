public class octadecimal {
    public static void main(String[] args) {
        int n = 12;
        int a=0;
        int b=0;
        for(int i=0;i<=n;i++){
            a=n/8;
            b=n%8;
        }
        int m=a*10+b;
        System.out.print(m);
        
    }
    
}
