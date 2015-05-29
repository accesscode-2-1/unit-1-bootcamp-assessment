/**
 * Created by Luke Lee on 5/28/15.
 */
public class MyObjectNode extends MyNode<MyObject> {
    @Override
    public MyNode getLeft() {
        return left;
    }

    @Override
    public MyNode getRight() {
        return right;
    }

    @Override
    public MyObject getData() {
        return data;
    }

    @Override
    public void setLeft(MyNode left) {
        this.left = left;

    }

    @Override
    public void setRight(MyNode right) {
        this.right = right;

    }

    @Override
    public void setData(MyObject data) {
        this.data = data;

    }

    @Override
    public void insert(MyNode<MyObject> newNode) {

    }


}
