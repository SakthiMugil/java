import java.util.*;
public class reverseadigit{
    public static void main (String args[]){
        System.out.println(add(24,1));
    }
    static int add(int x,int y){
        int reversesum =rev(x) + rev(y);
        int r=rev(reversesum);
        return r;
    }
    static int rev(int a){
        int sum=0;
        while(a>0){
            int digit=a%10;
            sum = sum*10+digit;
            a=a/10;
        }
        return sum;
    }
}
      

