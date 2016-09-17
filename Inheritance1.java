class A{
    public void print1(){
        System.out.println("Hello");
    }
}

class B extends A{
    public void print2(){
        System.out.println("Hello2");
    }
}
class Inheritance1 extends B{
    public static void main(String args[]){
        B in = new Inheritance1();
        in.print1();
        in.print2();
    }
}