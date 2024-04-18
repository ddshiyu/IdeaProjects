public class Zifuchuang {
    public static void main(String[] args){
        String s = "hello";
        s = "world";
        System.out.println(s);
        String a = "hello";
        String b = a;
        a = "world";
        System.out.println(b); // 字符串不可比变

        int v = 72;
        int z = 105;
        int c = 65281;
        char unv = (char) v;
        char unz = (char) z;
        char unc = (char) c;
        System.out.println(unv);
        System.out.println(unz);
        System.out.println(unc);
        int unicodeValue = 65; // 要转换的数字
        char unicodeChar = (char) unicodeValue; // 将数字转换为字符
        String unicodeString = String.format("\\u%04x", (int) unicodeChar); // 使用转义序列转换为 Unicode 字符串
        System.out.println("Unicode 字符为：" + unicodeString);

        String n = String.format("%c%c%c", v, z, c);
        System.out.println(n);

        /**
         * `String.format()` 方法可以用来创建格式化的字符串，其语法如下：
         *
         * ```java
         * String formattedString = String.format(format, args);
         * ```
         *
         * 其中，`format` 是一个包含格式说明符的字符串，而 `args` 则是一个参数列表，用来替换格式说明符中的占位符。
         *
         * 格式说明符由 `%` 符号和转换字符组成，用来指定如何格式化参数。常见的转换字符包括：
         *
         * - `%s`：字符串
         * - `%d`：整数
         * - `%f`：浮点数
         * - `%b`：布尔值
         * - `%c`：字符
         * - `%x`：十六进制
         *
         * 例如，如果要创建一个包含整数和字符串的格式化字符串，可以这样使用 `String.format()`：
         *
         * ```java
         * int intValue = 42;
         * String stringValue = "Hello";
         * String formattedString = String.format("Integer: %d, String: %s", intValue, stringValue);
         * System.out.println(formattedString);
         * ```
         *
         * 这将输出："Integer: 42, String: Hello"。
         *
         * `String.format()` 方法还支持更复杂的格式化，比如设置数字的小数位数、对齐等。你可以在格式说明符中添加更多的参数来实现这些功能。详细的使用方法可以参考 Java 官方文档或其他 Java 教程。
         */
    }
}
