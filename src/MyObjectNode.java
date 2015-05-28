/**
 * Access Code 2.1
 * Ramona Harrison
 * MyObjectNode.java
 */

public class MyObjectNode extends MyNode{
    MyNode left, right;
    Object data;

    public void setLeft(MyNode left) {
        this.left = left;
    }

    public void setRight(MyNode right) {
        this.right = right;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public MyNode getLeft() {

        return this.left;
    }

    @Override
    public MyNode getRight() {
        return this.right;
    }

    @Override
    public Object getData() {
        return this.data;
    }

    @Override
    public void insert(MyNode newNode) {

    }
}
