import java.util.*;

public class removeduplicatearray {
    public static void main(String[] args) {
        int []a={5,3,2,5,1,4,3,4};
        int []temp=new int[a.length];
        Arrays.sort(a);
        int j=0;
        for(int i=0;i< a.length-1;i++){
            if(a[i]!=a[i+1]){
            temp[j++]=a[i];
        }
    }
            temp[j]=a[a.length-1];
            for(int i=0;i<=j;i++){
                System.out.print(temp[i]+" ");
            }
     }
        
}
    

