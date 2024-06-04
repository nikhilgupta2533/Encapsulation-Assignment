package OOPS.Assignment.Static;

public class Ques2
{
    private int age;
    Ques2(int age)
    {
        this.age = age;
    }
    void display()
    {
        System.out.println("Age = "+age);
    }

    public static void main(String[] args) {
        Ques2 ques2 = new Ques2(16);
        ques2.display();
    }
}
