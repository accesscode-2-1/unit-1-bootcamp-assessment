/**
 * Access Code 2.1
 * Ray Acevedo
 * MyObjectNode.java
 */
public class MyObjectNode extends MyNode{

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
