import java.util.Arrays.*;
public class rotateanarray{
    public static void main(String[]args){
        int []a={1,2,3,4,5};
        int d=2;
        int n=a.length;
        for(int i=0;i<d;i++){
            int b=a[0];
            for (int j=0;j<n-1;j++){
                a[j]=a[j+1];
            }
            a[n-1]=b;
        }
         for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
         }       
     }
}
