import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

/**
 * @author liyi
 * @create 2021 -08 -12 -0:07
 */
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        // 此类 InetAddress 不能直接 new对象，因为构造器是 default修饰，不能在其它包中使用，所以使用静态方法获取
        InetAddress inetAddress = InetAddress.getByName("192.168.232.1");
        System.out.println(inetAddress);
        System.out.println(inetAddress.getHostName());
        System.out.println(inetAddress.getHostAddress());

        // 类：InetSocketAddress
        InetSocketAddress isa = new InetSocketAddress("192.168.232.1", 555);
        System.out.println(isa);
        System.out.println(isa.getAddress());
        System.out.println(isa.getHostName());
    }
}
