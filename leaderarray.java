public class leaderarray {
    public static void main(String[] args) {
        int[] a={12,17,33,15,18,21,7};
        for(int i=0; i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
            if(a[i]>=a[j]){
                System.out.print(a[i]+" ");

            } 
            break;          
           }
        }   
           System.out.print(a[a.length-1]);
    }
    
}
