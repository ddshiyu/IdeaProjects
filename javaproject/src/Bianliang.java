// 变量
public class Bianliang {
    public static void main(String[] args) {
//        int x = 100;
//        System.out.println(x);
//        x = 200;
//        System.out.println(x);
        int n = 100; // 定义变量n，同时赋值为100
        System.out.println("n = " + n); // 打印n的值

        n = 200; // 变量n赋值为200
        System.out.println("n = " + n); // 打印n的值

        int x = n; // 变量x赋值为n（n的值为200，因此赋值后x的值也是200）
        System.out.println("x = " + x); // 打印x的值

        x = x + 100; // 变量x赋值为x+100（x的值为200，因此赋值后x的值是200+100=300）
        System.out.println("x = " + x); // 打印x的值
        System.out.println("n = " + n); // 再次打印n的值，n应该是200还是300？
        char zh = '中';
        System.out.println(zh);
        // 使用var 可以省略前面的变量类型
        StringBuilder sb = new StringBuilder();
        var sbs = new StringBuilder();
    }
}

/**
 * StringBuilder 是 Java 中用于动态修改字符串的类，它允许在不创建新的字符串对象的情况下进行字符串的添加、插入、删除和修改操作。与 String 类不同，StringBuilder 对象是可变的，因此在需要频繁修改字符串内容时，使用 StringBuilder 可以提高性能和效率。
 *
 * 下面是使用 StringBuilder 类的一些常见操作：
 *
 * 1. **创建 StringBuilder 对象**：
 *    ```java
 *    StringBuilder sb = new StringBuilder(); // 创建一个空的 StringBuilder 对象
 *    StringBuilder sb = new StringBuilder("Hello"); // 创建一个包含初始内容的 StringBuilder 对象
 *    ```
 *
 * 2. **添加字符串**：
 *    ```java
 *    sb.append(" World"); // 在字符串末尾添加字符串
 *    ```
 *
 * 3. **插入字符串**：
 *    ```java
 *    sb.insert(5, "Beautiful "); // 在指定位置插入字符串
 *    ```
 *
 * 4. **删除字符串**：
 *    ```java
 *    sb.delete(6, 16); // 删除指定范围内的字符串
 *    ```
 *
 * 5. **修改字符串**：
 *    ```java
 *    sb.replace(0, 5, "Hi"); // 替换指定范围内的字符串
 *    ```
 *
 * 6. **获取字符串长度**：
 *    ```java
 *    int length = sb.length(); // 获取字符串的长度
 *    ```
 *
 * 7. **获取字符串**：
 *    ```java
 *    String result = sb.toString(); // 将 StringBuilder 对象转换为 String 类型
 *    ```
 *
 * 8. **其他操作**：StringBuilder 还提供了其他方法，如 reverse() 反转字符串、charAt() 获取指定位置的字符等。
 *
 * 需要注意的是，StringBuilder 是非线程安全的，如果在多线程环境中使用，建议使用 StringBuffer 类。StringBuilder 的性能通常比 StringBuffer 更好，但 StringBuffer 是线程安全的，适合在多线程环境中使用。
 */