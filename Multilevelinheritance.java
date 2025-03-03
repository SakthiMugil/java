public class Multilevelinheritance {
    
    public static void main(String[] args) {
        room a=new room();
        a.Name();
        a.Id();
        a.Classname();
    }
    
}
class college{
    public void Name(){
        System.out.println("Mugil");
    }

}
class dept extends college{
    public void Id(){
        System.out.println("48");
    }
}
class room extends dept{
    public void Classname(){
        System.out.println("AIML");
    }
}
