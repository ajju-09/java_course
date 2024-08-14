import com.sun.source.tree.ParenthesizedTree;

abstract class Parent{
    abstract public void greet();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}

class grandChild extends Parent{
    @Override
    public void greet(){
        System.out.println("Namaste");
    }
}

public class Abstract {
    public static void main(String[] args){
        grandChild gc = new grandChild();
        gc.greet();
    }
}
