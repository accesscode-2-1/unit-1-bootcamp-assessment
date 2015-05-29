import java.util.Random;

/**
 * Created by July on 5/28/15.
 */
public class MyObjectNode extends MyNode
{
    private int any;

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
//        Random r = new Random(0);
//        if (r.nextBoolean())
        if (this.getLeft() == null){
            this.setLeft(newNode);
        }
        else {
            this.getLeft().insert(newNode);
        }
    }
}
