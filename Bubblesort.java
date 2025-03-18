import java.util.*;
public class Bubblesort {
    public static void main(String[] args){
    int b[]={10,7,8,6,1,9};
    Bubblesort.Bs(b);
    System.out.println("Sorted Array ");
    System.out.println(Arrays.toString(b));
} 
    static void Bs(int Arr[]){
    int a=Arr.length;
    int i,j,temp;
    for(i=0;i<a-1;i++)
        for(j=0;j<a-i-1;j++)
        if(Arr[j]>Arr[j+1]){
            temp=Arr[j];
            Arr[j]=Arr[j+1];
            Arr[j+1]=temp;
        }
    }
}    
    
