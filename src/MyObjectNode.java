/**
 * Created by c4q-marbella on 5/28/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public abstract class MyObjectNode extends MyNode
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

    public void setRight(){

    }

    public void setLeft(){

    }

    public void setData(){

    }
//abstract methods
    public abstract void printData();

    public abstract void directions();
}
