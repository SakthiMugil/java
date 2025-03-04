import java.util.Scanner;
public class program1 {
        public static void main(String[] args) {
           print();
        }
        static void  print( ){
            Scanner q= new Scanner(System.in);
            System.out.print("Enter a string: ");
            String input=q.nextLine();
            int i=input.length()-1;
            int j=0;
            char a;
            String res="";
            int d2=0;
            StringBuilder val=new StringBuilder();
            while(j<=i){
                a=input.charAt(j);
                if(Character.isDigit(a)){
                    d2=a-'0';
                    mul(d2,res,val);
                    res="";
                }
                else{
                    res=res+a;
                }
                j++;
            }
            val.append(res);
           System.out.println(val);
        }
        static void mul(int d2, String res,StringBuilder val){
            for(int i=1;i<=d2;i++){
                val.append(res);
            }
        }
    }

