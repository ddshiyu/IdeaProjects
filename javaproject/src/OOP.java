import java.util.Arrays;

public class OOP {
    public static void main(String[] args) {
        City bj = new City();
        bj.name = "beijing";
        bj.latitude = 432.32;
        bj.longitude = 452;

        Person ming = new Person();
//      报错 ming.name = "fds";
        ming.setName("小明");
        ming.setDes("nice", "cow");

        String bob = "Bob";
        ming.setName(bob); // 传入bob变量
        System.out.println(ming.getName()); // "Bob"
        bob = "Alice"; // bob改名为Alice
        System.out.println(ming.getName()); // "Bob"还是"Alice"? 利用了字符串不可变性

        System.out.println(ming.getName());
        System.out.println(ming.getAge());
        System.out.println(Arrays.toString(ming.getDes()));


        // 构造方法
        Person1 hong = new Person1("hong", 20);
        System.out.println(hong.getName());
        System.out.println(hong.getAge());


        // 继承，改为protected可以直接访问
//        Person2 yang = new Person2();
//        yang.name = "杨";
//        System.out.println(yang.name);
//
//        Student feng = new Student();
//        System.out.println(feng.getName());

        PrimaryStudent zhou = new PrimaryStudent("zhou", 30, 20,4);
        System.out.println(zhou.getGrade());



        // 多态
        DuotaiSon d = new DuotaiSon();
        // 执行的Java的实例方法调用是基于运行时的实际类型的动态调用，而非变量的声明类型。
        //这个非常重要的特性在面向对象编程中称之为多态
        d.run();


        // 接口
        Student3 li = new Student3();
        li.run();
        Income[] incomes = new Income[] {
                new Income(3000),
                new Salary(7500),
                new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));

    }
    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}


class City {
    public String name;
    public double latitude;
    public double longitude;
}

class Person {
    private String name; // 禁止通过实例访问
    private int age;
    private String[] des;
    // public可以在外部调用
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    // private 只允许内部调用
    private int calcAge() {
        return 20;
    }
    public int getAge() {
        return calcAge();
    }

    public void setDes(String ...des) {
        this.des = des;
    }
    public String[] getDes() {
        return this.des;
    }
}

// 构造方法
class Person1 {
    private String name;
    private int age;
    // 构造方法
    // 会根据实例传递的参数个数来决定调用哪个构造方法并且实现不同的业务，也叫做方法重载
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello, " + name + "!");
    }
    // 会根据实例传递的参数个数来决定调用哪个构造方法并且实现不同的业务，也叫做方法重载
    public Person1(String name) {
        this.name = name;
        this.age = 12;
    }
    // 会根据实例传递的参数个数来决定调用哪个构造方法并且实现不同的业务，也叫做方法重载
    public Person1() {
        System.out.println("Hello, world!");
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}

// 继承
class Person2 {
    // protected 是让子类可以访问父类的字段
    protected String name="冯";
    protected int age;
    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Student extends Person2 {
    private int score;
    public Student(String name, int age, int score) {
        // 调用父类的构造方法
        super(name, age);
        this.score = score;
    }
    public String getName() {
        // 或者使用super.name，super指代父类
        return name;
    }
}

class PrimaryStudent extends Student {
    protected int grade;

    public PrimaryStudent(String name, int age, int score, int grade) {
        super(name, age, score);
        this.grade = grade;
    }

    public int getGrade() {
        return this.grade;
    }
}

// 只要某个class没有final修饰符，那么任何类都可以从该class继承
// 上述Shape类就是一个sealed类，它只允许指定的3个类继承它
//public sealed class Shape permits Rect, Circle, Triangle {
//
//}
//public final class Rect extends Shape {
//
//}
//
//public final class Ellipse extends Shape {
//
//}


// 多态
// 必须把Person类本身也声明为abstract，才能正确编译它，这叫抽象类
abstract class Duotai {
    // 父类的方法本身不需要实现任何功能，仅仅是为了定义方法签名，目的是让子类去覆写它，那么，可以把父类的方法声明为抽象方法
    public abstract void wander();
    public void run() {
        System.out.println("Person.run");
    }
    // 加了final 则不能被覆写
    public final String hello() {
        return "hello";
    }
}

class DuotaiSon extends Duotai {
    // 复写父类的方法，返回值和参数都必须一样
    @Override
    public void run() {
        System.out.println("Student.run");
    }
    @Override
    public void wander() {

    }
//    会报错
//    public void run(String s) {
//
//    }
//    会报错因为加了final
//    @Override
//    public String hello() {
//
//    }
}


// 接口，抽象方法本质上是定义接口规范：即规定高层类的接口，从而保证所有子类都有相同的接口实现，这样，多态就能发挥出威力,所有方法全部都是抽象方法，则可以接口interface
interface Person3 {
    public void run();
    String getName();
    // 默认方法可以直接用实例调用，不用在实现类中覆写
    default void walk() {
        System.out.println("walk");
    }
}

// 使用implements实现interface
class Student3 implements Person3 {
    @Override
    public void run() {
        System.out.println("跑起来");
    }
    @Override
    public String getName() {
        return "你好啊";
    }
}
// 一个类可以实现多个接口
//class Student implements Person, Hello { // 实现了两个interface
//    ...
//}
// 使用接口实现计税
interface IncomeTax {
    double getTax();
}

class Income implements IncomeTax {
    protected double income;

    public Income(double income) {
        this.income = income;
    }

    public double getTax() {
        return income * 0.1; // 税率10%
    }
}

class Salary extends Income {
    public Salary(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class StateCouncilSpecialAllowance extends Income {
    public StateCouncilSpecialAllowance(double income) {
        super(income);
    }

    @Override
    public double getTax() {
        return 0;
    }
}






























