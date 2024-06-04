package OOPS.Assignment.Static;

public class Ques3
{
    private int age;

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Ques3 ques3 = new Ques3();
        ques3.setAge(45);
        System.out.println(ques3.getAge());
    }
}
