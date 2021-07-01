package Algorithm.src.hello.ch03;

public class Greet {

    public static void main(String[] args) {
        greet("dex");
    }

    public static void greet(String name){
        System.out.println(name);
        greet2(name);
        System.out.println("====");
        bye(name);

    }

    public static void greet2(String name){
        System.out.println("hi!!! " + name);
    }

    public static void bye(String name){
        System.out.println("bye~~~ "+ name);
    }

}
