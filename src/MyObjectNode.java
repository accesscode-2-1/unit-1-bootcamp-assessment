/**
 * Created by c4q-anthony-mcbride on 5/28/15.
 */
public class MyObjectNode extends MyNode
{
    public static void main(String[] args)
    {
        MyObject o = new MyObject();
        MyObject oTwo = new MyObject();
        MyObject oThree = new MyObject();

        o.setName("Object");
        o.setAge(1);

        oTwo.setName("Object");
        oTwo.setAge(1);

        oThree.setName("Object");
        oThree.setAge(2);


        System.out.println(o.isEqual(oTwo));
        System.out.println(oTwo.isEqual(oThree));

    }
    private MyNode left;
    private MyNode right;
    private Object data;

    public void setLeft(MyNode left){
        this.left = left;
    }
    public void setRight(MyNode right){
        this.right = right;
    }
    public void setData(Object data){
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

