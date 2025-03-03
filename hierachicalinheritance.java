public class hierachicalinheritance {
    public static void main(String[] args) {
        room a= new room();
        //dept b=new dept();
        a.Name();
        a.Classname();
        //b.Id();
        
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
class room extends college{
    public void Classname(){
        System.out.println("AIML");
    }
}
