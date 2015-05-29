import java.util.ArrayList;

/**
 * Created by c4q-sarahkim on 5/28/15.
 */
public class MyObjectNode<T> extends MyNode<T>
{
    public MyObjectNode() {
        super();
    }

    public void setLeft(MyNode left) {
        this.left = left;
    }

    public void setRight(MyNode right) {
        this.right = right;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public MyNode getLeft()
    {
        return this.left;
    }

    @Override
    public MyNode getRight()
    {
        return this.right;
    }

    @Override
    public T getData()
    {
        return this.data;
    }

    @Override
    public void insert(MyNode<T> newNode)
    {
        ArrayList<MyNode> node = new ArrayList<MyNode>();
        node.add(newNode);
    }

    public static void main(String[] args)
    {
        boolean test;
        MyObjectNode node = new MyObjectNode();
        if (node.getClass().isInstance(MyNode.class))
            test = true;
        else
            test = false;
        System.out.println(test);
    }
}
