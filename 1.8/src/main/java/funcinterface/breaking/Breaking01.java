package funcinterface.breaking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author liyi
 * @create 2021 -08 -19 -15:37
 */
public class Breaking01 { // 函数式接口：断定型
    public static void main(String[] args) {
        // 显出长度超过5的字符串
        List<String> list = Arrays.asList("dasdas", "fcsdacdes", "as", "dwed", "xsaxxxa");

        // 使用断定型接口
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 5;
            }
        };

        List<String> back = FilterString(list, predicate);
        System.out.println(back);

    }

    // 方法：过滤字符串
    public static List<String> FilterString(List<String> list, Predicate<String> predicate) {
        ArrayList<String> list1 = new ArrayList<>();
        for (String string : list) {
            boolean test = predicate.test(string);
            if (test) {
                list1.add(string);
            }
        }
        return list1;
    }
}
