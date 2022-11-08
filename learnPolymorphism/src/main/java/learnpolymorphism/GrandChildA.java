package learnpolymorphism;
public class GrandChildA extends ChildA {
    protected int number =40;
    public String toString(){
        return "Grand Child "+number;
    }
    public String methodGrand(){
        return "method Grand Child A";
    }
}
