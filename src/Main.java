import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;

/**
 * Created by c4q-nali on 5/28/15.
 */
public class Main {

    public static void main(String[] args) {

        MyObject one = new MyObject("John", 20);
        System.out.println("" + one.equals(null));

        MyObject two = new MyObject("John", 20);
        System.out.println(""+two.equals(null));

        System.out.println(""+one.equals(one));
        System.out.println(""+two.equals(two));
        System.out.println(""+one.equals(two));
        System.out.println(""+two.equals(one));



    }
}
