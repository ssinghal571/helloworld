public class HelloWorld {

    public void invokeSayHello() {
        new MySecondClass().sayHello();
    }
    public static void main(String[] args) {
        System.out.println("Hello motu");
        System.out.println(Math.sqrt(9));
        new HelloWorld().invokeSayHello();

    }
    
    public void sayHello(String name) {
    	System.out.println("Hello "+name);
    }
}


class MySecondClass {
    public void sayHello() {
        System.out.println("I'm saying hello from MySecondClass");
    }
}