class Super{
    public Super(){
        System.out.println("I am a Super Class");
    }
}

class Sub extends Super{
    public Sub(){
        System.out.println("I am a Sub class");
    }
}

class SuperSub extends Sub{
    public SuperSub(){
        System.out.println("I am a SuperSub class");
    }
}
public class inhertanc_construc {
    public static void main(String[] args){
//        Super s = new Super();
//        Sub sb = new Sub();
        SuperSub sbb = new SuperSub();

    }
}
