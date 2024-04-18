import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

// 数组
public class Shuzu {
    public static void main(String[] args){
        /**
         *  定义数组的几种方法
         *  在 Java 中定义一个数组，你需要指定数组的类型和大小。以下是几种定义数组的方式：
         *
         * 1. **在声明时指定数组的大小，并初始化数组元素**：
         * ```java
         * // 声明并初始化一个整数数组
         * int[] numbers = {1, 2, 3, 4, 5};
         *
         * // 声明并初始化一个字符串数组
         * String[] names = {"Alice", "Bob", "Charlie"};
         * ```
         *
         * 2. **在声明时指定数组的大小，之后初始化数组元素**：
         * ```java
         * // 声明一个整数数组，指定数组大小为 5
         * int[] numbers = new int[5];
         * // 初始化数组元素
         * numbers[0] = 10;
         * numbers[1] = 20;
         * numbers[2] = 30;
         * numbers[3] = 40;
         * numbers[4] = 50;
         * ```
         *
         * 3. **声明数组时不指定数组大小，之后动态初始化数组**：
         * ```java
         * // 声明一个字符串数组，但不指定大小
         * String[] names;
         * // 动态初始化数组，指定数组大小为 3
         * names = new String[3];
         * // 初始化数组元素
         * names[0] = "Alice";
         * names[1] = "Bob";
         * names[2] = "Charlie";
         * ```
         *
         * 4. **使用 `new` 关键字初始化数组，同时指定大小和元素类型**：
         * ```java
         * // 使用 new 关键字声明并初始化一个整数数组，大小为 3
         * int[] numbers = new int[]{1, 2, 3};
         * ```
         *
         * 无论使用哪种方式，一旦数组被声明和初始化，你就可以通过索引访问数组元素，并对其进行读取或修改。
         */
        String[] names = {"tom", "bob"};
        String s = names[1];
        names[1] = "marry";
        System.out.println(s);

        // 一、遍历数组
        int[] ns = {1, 2, 3, 4, 0};
        for (int n : ns) {
            System.out.println(n);
        }
        // Arrays.toString直接打印数组
        System.out.println(Arrays.toString(ns));

        // 二、排序
        Arrays.sort(ns);
        System.out.println(Arrays.toString(ns));
        Integer[] nss = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        Arrays.sort(nss);

        for (int i = nss.length - 1; i > 0; i--) {
            System.out.println(Arrays.toString(ns));
        }
        Arrays.sort(nss, Collections.reverseOrder());
        System.out.println(Arrays.toString(nss));
        int mid = nss.length / 2;

        // 遍历数组前半部分，并与对应的后半部分元素交换位置
        for (int i = 0; i < mid; i++) {
            int temp = nss[i];
            nss[i] = nss[nss.length - 1 - i];
            nss[nss.length - 1 - i] = temp;
        }

        // 输出倒序后的数组
        System.out.println("倒序后的数组：");
        for (int number : nss) {
            System.out.print(number + " ");
        }
        // 三、多维数组
        int[][] nsk = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        System.out.println(nsk.length); // 3
        int[][] ss = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
//        Arrays.sort(ss);
        System.out.println(Arrays.toString(ss)); // 3
    }
}
