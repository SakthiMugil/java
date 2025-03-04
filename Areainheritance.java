public class Areainheritance {
    public static void main(String[]args){
        Rectangle b=new Rectangle(9,6);
        Square m=new Square(7);
        b.Rect();
        m.Sq();
    }
}
class Shape{
    int i,j;
    Shape(int i,int j){
        this.i=i;
        this.j=j;
    
    }
    void Rect(){
        System.out.print("Area of Rectangle: ");
    }
    void Sq(){
        System.out.print("Area of Square: ");
    }
}
class Rectangle extends Shape{
    Rectangle(int i,int j){
        super(i,j);
    }
      void Rect(){
        int a=i*j;
        super.Rect();
        System.out.println(a);
    }
}
class Square extends Shape{
    Square(int i){
        super(i,i);
        
    }
    void Sq(){
        int c=i*i;
        super.Sq();
        System.out.print(c);
    }
}