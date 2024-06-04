package OOPS.Assignment.Static;

public class Ques1 {
    // Static variable to keep track of the number of instances
    private static int instanceCount = 0;

    // Constructor increments the instance count each time an object is created
    public Ques1() {
        instanceCount++;
    }

    // Static method to get the current instance count
    public static int getInstanceCount() {
        return instanceCount;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a few instances
        Ques1 obj1 = new Ques1();
        Ques1 obj2 = new Ques1();
        Ques1 obj3 = new Ques1();

        // Display the number of instances created
        System.out.println("Number of instances created: " + Ques1.getInstanceCount());
    }
}
