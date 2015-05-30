/**
 * Created by c4q-Allison on 5/28/15.
 */
public abstract class MyObjectNode extends MyNode
{
    public MyObjectNode left;
    public MyObjectNode right;
    public MyObjectNode data;

    public MyObjectNode()
    {
        MyObjectNode myObjectNode = new MyObjectNode()
        {
            @Override
            public MyNode getLeft()
            {
                return null;
            }

            @Override
            public MyNode getRight()
            {
                return null;
            }

            @Override
            public Object getData()
            {
                return null;
            }

            @Override
            public void insert(MyNode newNode)
            {

            }
        };

    }


    public void setLeft() {
        this.left = left;
    }

    public void setRight() {
        this.right = right;
    }
    public void setData() {
        this.data = data;
    }



}
