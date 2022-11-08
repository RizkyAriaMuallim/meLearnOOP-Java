package learnpolymorphism;
public class ChildB extends Parent {
    protected int number=30;
    public String toString(){
        return "Child B "+number;
    }
    public String methodB(){
        return "method Child B";
    }
}
