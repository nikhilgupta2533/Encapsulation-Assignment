package OOPS.Assignment.Static;

public class Ques5
{
    private int age;
    static
    {
        System.out.println("This is an static block");
    }
    Ques5()
    {
        System.out.println("It's an default constructor");
    }
    Ques5(int age)
    {
        this.age = age;
    }
    void display()
    {
        System.out.println("age = "+age);
    }

    public static void main(String[] args) {

        Ques5 ques5 = new Ques5();
        ques5.display();
        Ques5 ques51 = new Ques5(55);
        ques51.display();

    }
}
