
interface honeyInterface{
    String  animal= "bee";
    void makehony();

}
public class InterfacExample implements honeyInterface {


    public static void main(String[] args) {
        System.out.println(animal);
        InterfacExample ex= new InterfacExample();
        ex.makehony();
    }
    public void makehony(){
        System.out.println("it is made");
    }
}