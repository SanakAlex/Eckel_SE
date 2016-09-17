package C_7;

/**
 * Created by Sanak Alex on 19.05.2016.
 */
class Root{
    protected Component1 component1 = new Component1(1);
    protected Component2 component2 = new Component2(2);
    protected Component3 component3 = new Component3(3);
    Root(int i){
        System.out.println("Root "+i);
    }
    void dispose(){
        System.out.println("Root cleaning");
        component3.dispose();
        component2.dispose();
        component1.dispose();
    }
}
class Component1{
    Component1(int i){
        System.out.println("comp1 "+i);
    }
    void dispose(){
        System.out.println("comp1 cleaning");
    }
}
class Component2{
    Component2(int i){
        System.out.println("comp1 "+i);
    }
    void dispose(){
        System.out.println("comp1 cleaning");
    }
}
class Component3{
    Component3(int i){
        System.out.println("comp1 "+i);
    }
    void dispose(){
        System.out.println("comp1 cleaning");
    }
}
class Stem extends Root {
    protected Component1 component1 = new Component1(4);
    protected Component2 component2 = new Component2(5);
    protected Component3 component3 = new Component3(6);
    Stem(int i){
        super(i);
        System.out.println("Stem "+i);
    }
    void dispose(){
        System.out.println("Stem cleaning");
        component3.dispose();
        component2.dispose();
        component1.dispose();
        super.dispose();
    }
}
public class Ex_9_10_12 {
    public static void main(String[] args) {
        new Stem(77);
    }
}
