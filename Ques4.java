package OOPS.Assignment.Static;

public class Ques4
{
    static int age;
    static
    {
        age = 18;
    }
    static void display()
    {
        System.out.println(age);
    }
    public static void main(String[] args) {
        Ques4.display();
    }
}
