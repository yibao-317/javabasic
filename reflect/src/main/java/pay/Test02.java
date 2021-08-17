package pay;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author liyi
 * @create 2021 -08 -17 -11:19
 */
public class Test02 { // 反射
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        // 用户具体选择的支付类型
        String string = "pay.Alipay";
        // 反射 ，关联到实现类的 "构造器"
        Class c = Class.forName(string);
        // 获取到对象
        Object o = c.newInstance();
        // 获取到方法
        Method pay = c.getMethod("pay");
        // 执行方法
        pay.invoke(o);

    }
}
