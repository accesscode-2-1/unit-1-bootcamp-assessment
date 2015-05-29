/**
 * Create a MyObjectNode class which extends MyNode.
 * <p/>
 * Add setter methods, that is setLeft and setRight and setData.
 * <p/>
 * Implement the abstract methods.
 */
public class MyObjectNode<T> extends MyNode<T> {


    public void setLeft(MyNode<T> node) {
        this.left = node;
    }

    public void setRight(MyNode<T> node) {
        this.right = node;
    }

    public void setData(T data) {
        this.data = data;
    }


    @Override
    public MyNode getLeft() {
        return left;
    }

    @Override
    public MyNode getRight() {
        return right;
    }

    @Override
    public T getData() {
        return data;
    }

//    public abstract void insert(MyNode<T> newNode);

    @Override
    public void insert(MyNode newNode) {

    }
}
