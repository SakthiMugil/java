public class longnumbers {
    public static void main(String[]args){
        String num = "343434";
        String num1 = "989898";
        int a = num.length()-1;
        int b = num1.length()-1;
        int c, i=0,d1,d2,d3;
        StringBuilder sum = new StringBuilder();
        StringBuilder k= new StringBuilder();
        while(a>=0&&b>=0){
           d1=num.charAt(a)-'0';
           d2=num1.charAt(b)-'0';
           d3=d1+d2+i;
           c=d3%10;
           i=d3/10;
           if(a!=0){
            sum.append(c);
           }
           else{
            k.append(d3);
            k.reverse();
            sum.append(k);
           }
           a--;
           b--;
    }
    System.out.print(sum.reverse());
    }
}