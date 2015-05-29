import java.util.ArrayList;

/**
 * Created by c4q-anthonyf on 5/28/15.
 */
public class MyObjectNode<T> extends MyNode
{
    ArrayList<MyNode> nodes;

    public MyObjectNode(){
        super();
        nodes = new ArrayList<MyNode>();
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
        nodes.add(newNode);
    }

    public ArrayList<MyNode> getNodes(){
        return nodes;
    }

    public void setLeft(MyNode left){
        this.left = left;
    }

    public void setRight(MyNode right){
        this.right = right;
    }

    public void setData(T data){
        this.data = data;
    }

    public static void main(String[] args)
    {

    }
}
