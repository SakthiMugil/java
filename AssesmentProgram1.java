public class AssesmentProgram1 {
    public static void main(String[] args) {
        int [][] a={{1,2,3},{4,5,6},{7,8,9}};
        int  x=0,x1=0,x2=0,flag=0;
        int r=a.length;
        int c=a[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(x<a[i][j])
                   x=a[i][j];
            }
        }
        flag=0;
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if((x1<a[i][j]) && (a[i][j]!=x)){
                   x1=a[i][j];
                   flag=1;
                }
           }
        }
        flag=0;
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if((x2<a[i][j]) && (a[i][j]!=x) && (a[i][j]!=x1)){
                   x2=a[i][j];
                   flag=1;
                }
            }
        }
        if(flag==0){
        System.out.println("No third max value");
        }
        else{
        System.out.println("Third max number = "+ x2);
        }
    }
} 