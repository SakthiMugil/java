public class Singleinheritance {
    public static void main(String[] args) {
        dept a=new dept();
        a.Name();
        a.Id();
    }
    
}
class college{
    void Name(){
        System.out.println("Mugil");
    }

}
class dept extends college{
    void Id(){
        System.out.println("48");
    }
}
