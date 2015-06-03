/**
 * Created by amyquispe on 6/2/15.
 */
public class MyObjectNode extends MyNode<MyObject> {

    MyObjectNode left;
    MyObjectNode right;
    MyObject data;

    MyObjectNode(){
        left = null;
        right = null;
        data = null;
    }

    @Override
    public MyObjectNode getLeft() {
        return this.left;
    }

    @Override
    public MyObjectNode getRight() {
        return this.right;
    }

    @Override
    public MyObject getData() {
        return this.data;
    }

    public void setLeft(MyObjectNode node){
        this.left = node;
    }

    public void setRight(MyObjectNode node){
        this.right = node;
    }

    public void setData(MyObject object){
        this.data = object;
    }

    @Override
    public void insert(MyNode<MyObject> newNode) {
        MyObjectNode rightmost = this;
        while(rightmost.getRight()!= null){
            rightmost = rightmost.getRight();
        }
        rightmost.setRight((MyObjectNode)newNode);
    }
}
