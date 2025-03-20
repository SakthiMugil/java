import java.util.*;
public class romentointeger {
    public static int romanToInt(String s) {
        int temp=0;
        int a=0;
          for(int i=s.length()-1;i>=0;i--){
              int b=getValue(s.charAt(i));
              if(b<a)
              temp-=b;
              else
              temp+=b;
              a=b;
          }
          return temp;
          }
   public static int getValue(char ch) {
          switch (ch) {
              case 'I': return 1;
              case 'V': return 5;
              case 'X': return 10;
              case 'L': return 50;
              case 'C': return 100;
              case 'D': return 500;
              case 'M': return 1000;
              default: return 0; 
          }
}
            public static void main(String[] args) {
                
                System.out.print("Enter the romen number = ");
                Scanner sc=new Scanner(System.in);
                String s=sc.nextLine();
                System.out.println(romanToInt(s));
            }
}
                