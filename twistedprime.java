public class twistedprime{
    static public boolean isPrime(int n){
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n=167;
        int rem, rev=0;
        boolean flag;
        flag = isPrime(n);
        System.out.println(flag);
        if(flag)
        {
            for(;n>0;){
                rem=n%10;
                rev = (rev*10)+rem;
                n=n/10;
            }
            System.out.println(rev);
            flag = isPrime(rev);
        }
            if(flag)
                System.out.println("Twisted prime");
            else    
                System.out.println("Not a Twisted prime");
            
    }
    
}
