import java.util.Objects;

/**
 * Created by c4q-nali on 5/28/15.
 */
public class MyObjectNode extends MyNode {

    @Override
    public MyNode getLeft() {
        return null;
    }

    @Override
    public MyNode getRight() {
        return null;
    }

    @Override
    public Object getData() {
        return null;
    }

    @Override
    public void insert(MyNode newNode) {

    }

    public MyObjectNode() {

    }

    public void setLeft(MyNode left) {
        this.left = left;
    }

    public void setRight(MyNode right) {
        this.right = right;
    }

    public void setData(Object data) {
        this.data = data;
    }




}
