/**
 * Created by alvin2 on 5/28/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class MyObjectNode extends MyNode
{
    protected MyNode left;
    protected MyNode right;
    protected MyNode data;

    public void setLeft(MyNode left) {
        this.left = left;
    }

    public void setRight(MyNode right) {
        this.right = right;
    }

    public void setData(MyNode data) {
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
    public Object getData()
    {
        return this.data;
    }

    @Override
    public void insert(MyNode newNode)
    {

    }
}
