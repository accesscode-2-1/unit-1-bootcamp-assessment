public class Exercises {

    static class Parent {
        public String doStuff() { return "parent"; }
    }
    static class Child extends Parent {
        public String doStuff() { return "child"; }
        public String doStuff(String s) { return "Howdy"; }
    }

    public static void main(String[] args) {
        MyObjectNode x = new MyObjectNode();
        x.setLeft();
        x.setRight();
        x.setData();
    }


}
