public class primenumber {
    public static void main(String[]args){
        int a = 119;
        for(int i=2;i<a;i++){
            if(a % i==0){
                System.out.print(a +" is not prime");
                break;
            }else{
                System.out.print(a +" is prime");
                break;
            }
            
        }
    }
}