import java.util.ArrayList;

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



//        if ( getRight()!= null) {
//            right = getRight().contains(someData);
//        }
//        else {
//            right = false;
//        }



        return left || right;
    }

    public static void main(String[] args)
    {
        ArrayList l = new ArrayList();
        l.add(1);
        l.add("hello");
        l.add(0.0f);

        int value = (Integer) l.get(0);
        String value2 = (String) l.get(1);
        System.out.println(value + " " + value2 );
    }
}
