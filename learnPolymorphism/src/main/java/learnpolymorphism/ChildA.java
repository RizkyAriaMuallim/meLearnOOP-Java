package learnpolymorphism;
public class ChildA extends Parent {
    protected int number =20;
    public String toString(){
        return "Child A "+number;
    }
    public String methodA(){
        return "method Child A";
    }
}
