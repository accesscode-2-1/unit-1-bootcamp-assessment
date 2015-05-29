/**
 * Created by c4q-Abass on 5/28/15.
 */
public class MyObjectNode extends MyNode {
    private MyNode left, right, data;
    @Override
    public MyNode getLeft() {
        return null;
    }

    @Override
    public MyNode getRight() {
        return null;
    }

    @Override
    public Object getData() {
        return null;
    }

    @Override
    public void insert(MyNode newNode) {
                                          //add this my node
    }


    public void setLeft(){
        this.insert(left);

    }

    public void setRight(){
        this.insert(right);
    }
    public void setData(){
        this.insert(right);
    }

    public static void main(String[] args) {
        MyObject x = new MyObject();
    }

}
