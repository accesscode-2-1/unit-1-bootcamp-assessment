/**
 * Created by pooja on 5/29/15.
 */
public class MyObjectNode extends MyNode {

    public MyObjectNode() {

    }

    public MyNode getLeft() {
        return left;
    }

    public MyNode getRight() {
        return right;
    }

    public Object getData() {
        return data;
    }

    public void setLeft(MyNode left) {
        this.left = left;
    }

    public void setRight(MyNode right) {
        this.right = right;
    }

    public void setData(MyNode data) {
        this.data = data;
    }

    public void insert(MyNode newNode) {

    }

    public static void main(String[] args) {
        MyObjectNode myNode = new MyObjectNode();
        MyObjectNode leftNode = new MyObjectNode();
        MyObjectNode rightNode = new MyObjectNode();
        myNode.setLeft(leftNode);
        myNode.setRight(rightNode);
        System.out.println(myNode.getLeft());
        System.out.println(myNode.getRight());
        System.out.println(myNode.getData()); // null
        myNode.setData(leftNode);
        System.out.println(myNode.getData()); // leftNode
        System.out.println(myNode.contains(leftNode)); // true
        System.out.println(myNode.contains(rightNode)); // false
    }

}
