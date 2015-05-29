/**
 * Created by Jorge Reina on 5/28/15.
 */
public class MyObjectNode extends MyNode
{
    protected MyNode left;
    protected MyNode right;
    protected MyNode data;

    public void  setLeft(MyNode Left)
    {
        this.left=left;
    }

    public void  setRight(MyNode Right)
    {
        this.right=right;
    }

    public void  setData(MyNode Data)
    {
        this.data=data;
    }

    @Override
    public MyNode getLeft()
    {
        return left;
    }

    @Override
    public MyNode getRight()
    {
        return right;
    }

    @Override
    public Object getData()
    {
        return data;
    }

    @Override
    public void insert(MyNode newNode)
    {

    }

}
