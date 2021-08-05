package collection.mylinked;

/**
 * @author liyi
 * @create 2021 -08 -05 -21:09
 */
public class Node { // 节点类
    private Object pre; // 前一个节点的地址
    private Object obj; // 当前节点内容
    private Object next; // 后一个节点的地址

    public Object getPre() {
        return pre;
    }

    public void setPre(Object pre) {
        this.pre = pre;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Object getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = next;
    }
}
