package collection.list.mylinked;

/**
 * @author liyi
 * @create 2021 -08 -06 -0:42
 */
public class MyLinkedList { // 模拟链表
    private Node first; // 链表中的第一个节点
    private Node last; // 链表中的最后一个节点

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    /*
        方法：添加元素
         */
    public void add(Object o) {
        if (null == first) {
            // 链表中没有节点，则当前的元素为第一个节点
            Node n = new Node();
            n.setPre(null);
            n.setObj(o);
            n.setNext(null);
            // 将第一个、最后一个都设置为当前节点
            first = n;
            last = n;
        } else {
            // 链表中有节点，则将当前元素加入，并设置为最后一个节点
            Node n = new Node();
            n.setPre(last);
            n.setObj(o);
            n.setNext(null);
            // 将原来最后一个节点的下一个，指向当前
            last.setNext(n);
            // 将最后一个节点设置为当前
            last = n;
        }
    }

    /*
    测试
     */
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(12);
        list.add("aaa");
        list.add(6.52);
        System.out.println(list);

    }
}
