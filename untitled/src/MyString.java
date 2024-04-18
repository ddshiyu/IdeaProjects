import java.beans.*;
import java.math.BigInteger;
public class MyString {
    public static void main(String[] args) {
        if (args.length > 0) {
            hello(args[0]);
        } else {
            System.out.println("Hello.");
        }
    }

    static void hello(String name) {
        new Hello().hello(name);
    }
}

class Hello {
    void hello(String name) {
        System.out.println("Hello, " + name + ".");
    }
}