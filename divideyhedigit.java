import java.util.*;

public class divideyhedigit {
        public static float divide(int dividend, int divisor) {
            
            if(dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;
            return dividend/divisor;
        }
    
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value = ");
    int n1= sc.nextInt();
    int n2= sc.nextInt();
    float result=divide(n1,n2);
    System.out.println(result);
    

}}
 