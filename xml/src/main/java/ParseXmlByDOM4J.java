import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Iterator;
import java.util.List;

/**
 * @author liyi
 * @create 2021 -08 -18 -14:57
 */
public class ParseXmlByDOM4J { // 使用 DOM4J 解析 XML
    public static void main(String[] args) throws DocumentException {
        // 1、创建 xml 解析器
        SAXReader sr = new SAXReader();
        // 2、读取 XML
        Document dom = sr.read(new File("E:\\student.xml"));
        // 3、获取根节点
        Element studentsEle = dom.getRootElement();
        // 4、获取子节点
        Iterator<Element> iterator = studentsEle.elementIterator();
        while (iterator.hasNext()) {
            // 4.1 获取子节点
            Element stuEle = iterator.next();
            // 4.2 获取子节点属性
            List<Attribute> attributes = stuEle.attributes();
            for (Attribute a : attributes) {
                System.out.println("节点属性为：" + a.getName() + "---" + a.getText());
            }
            // 4.3 获取子节点的子节点
            Iterator<Element> iterator1 = stuEle.elementIterator();
            while (iterator1.hasNext()) {
                Element stu = iterator1.next();
                System.out.println("节点是：" + stu.getName() + "---" + stu.getText());
            }

            System.out.println();
        }
    }

}
