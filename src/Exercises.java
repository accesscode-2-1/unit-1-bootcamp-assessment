public class Exercises {

    static class Parent {

        public Parent() {};

        public String doStuff() { return "parent"; }
    }
    static class Child extends Parent {

        public Child() {};

        public String doStuff() { return "child"; }
        public String doStuff(String s) { return s; }
    }


}
