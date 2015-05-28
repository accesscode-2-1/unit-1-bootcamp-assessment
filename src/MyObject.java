/**
 * Access Code 2.1
 * Ramona Harrison
 * MyObject.java


 Create a new class, MyObject. A MyObject has a name (String) and an age (int).

 Two MyObjects are equal when the names and the ages are equal.

 Create a MyObjectNode class which extends MyNode.

 Add setter methods, that is setLeft and setRight and setData.

 Implement the abstract methods.

 Run the tests in src/Tests.java.

 Write a main method to test your code.

 Update your README with your end time, and the total amount of time you think you spent on this assessment.

 Submit a pull request with all your code.

 */

public class MyObject {

    private String name;
    private int age;

    public MyObject(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
