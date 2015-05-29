/**
 * Created by amyquispe on 5/28/15.
 */
public abstract class MyNode<T> {
    protected MyNode left;
    protected MyNode right;
    protected T data;

    public abstract MyNode getLeft();

    public abstract MyNode getRight();

    public abstract T getData();

    public void setLeft(MyNode left) {
       // this.left = left;
    }

    public void setRight(MyNode right) {
       // this.right = right;
    }

    public void setData(MyNode data) {
        //this.data = data;
    }

    public abstract void insert(MyNode<T> newNode);
    public boolean contains(T someData){
        if(getData()==null && someData == null){
            return false;
        }
        if(getData()!= null && someData!=null && getData().equals(someData)) {
            return true;
        }
        boolean left = getLeft()!=null ? getLeft().contains(someData) : false;
        boolean right = getRight()!=null ? getRight().contains(someData) : false;

        return left || right;
    }
}
