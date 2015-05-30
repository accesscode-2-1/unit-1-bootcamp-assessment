/**
 * Created by c4q-rosmary on 5/29/15.
 */
public class MyObjectNode extends MyNode
{

    @Override
    public MyNode getLeft()
    {
        return this.left;
    }

    public void setLeft(MyNode left){
        this.left = left;
    }


    @Override
    public MyNode getRight()
    {
        return this.right;
    }

    public void setRight(MyNode right){
        this.right = right;
    }

    @Override
    public Object getData()
    {
        return this.data;
    }

    public void setData(MyNode data) {
        this.data = data;
    }

    @Override
    public void insert(MyNode newNode)
    {

    }
}
