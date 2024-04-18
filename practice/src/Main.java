import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] ns = { 1, 8, 4, 9, 16, 25 };
        int sum = 0;
        for (int i=0; i<ns.length; i++) {
            System.out.println("i = " + i + ", ns[i] = " + ns[i]);
            sum = sum + ns[i];
        }
        System.out.println("sum = " + sum);
        for (int n : ns) {
            System.out.println(n);
        }
        for (int i=ns.length-1; i>=0; i --) {
            System.out.println(ns[i]);
        }
//        for (int i = 0; i < ns.length - 1; i++) {
//            for (int j = 0; j < ns.length - i - 1; j++) {
//                if (ns[j] > ns[j+1]) {
//                    // 交换ns[j]和ns[j+1]:
//                    int tmp = ns[j];
//                    ns[j] = ns[j+1];
//                    ns[j+1] = tmp;
//                }
//            }
//        }
        // 排序后:
        for (int i = ns.length - 1; i >= 0; i++) {
            for (int j = ns.length - 1; j < ns.length - i - 1; j++) {
                if (ns[j] < ns[j+1]) {
                    // 交换ns[j]和ns[j+1]:
                    int tmp = ns[j];
                    ns[j] = ns[j+1];
                    ns[j+1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(ns));
        int[][] nss = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        System.out.println(Arrays.deepToString(nss));
        int[][] scores = {
                { 82, 90, 91 },
                { 68, 72, 64 },
                { 95, 91, 89 },
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        int summ = 0;
        for (int[] arr : scores) {
            for (int n : arr) {
                summ += n;
            }
        }
        System.out.println(summ);
        for (String arg : args) {
            if ("-version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }
        }
        Person p = new Person();
        int n = 15; // n的值为15
        p.setAge(n); // 传入n的值
        System.out.println(p.getAge()); // 15
        n = 20; // n的值改为20
        System.out.println(p.getAge()); // 15还是20?

        Persons ming = new Persons();
        ming.setName("小明");
        ming.setAge(12);
    }
}



class Person {
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}