interface interfaceParent1{
    void meth1();
    void meth2();
}
interface interfaceChild extends interfaceParent1{
    void meth3();
    void meth4();
}
class MySampleClass implements interfaceChild{
    public void meth1(){
        System.out.println("I am method 1 of interface");
    }
    public void meth2(){
        System.out.println("I am method 2 of interface");
    }
    public void meth3(){
        System.out.println("I am method 3 of interface");
    }
    public void meth4(){
        System.out.println("I am method 4 of interface");
    }
}
public class Inher_in_Interface {
    public static void main(String[] args) {
        MySampleClass my = new MySampleClass();
        my.meth1();
        my.meth2();
        my.meth3();
        my.meth4();
    }
}
