/**
 * Project name(项目名称)：匿名对象 anonymous-object
 * Package(包名): PACKAGE_NAME
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/6
 * Time(创建时间)： 11:52
 * Version(版本): 1.0
 * Description(描述)： 每次 new 都相当于开辟了一个新的对象，并开辟了一个新的物理内存空间。
 * 如果一个对象只需要使用唯一的一次，就可以使用匿名对象，匿名对象还可以作为实际参数传递。
 * 匿名对象就是没有明确的给出名字的对象，是对象的一种简写形式。一般匿名对象只使用一次，
 * 而且匿名对象只在堆内存中开辟空间，而不存在栈内存的引用。
 */

public class Student
{
    private String name;
    private int age;

    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void display()
    {
        System.out.println("姓名：" + name + "\t年龄：" + age);
    }


    public static void main(String[] args)
    {
        new Student("张三", 19).display();
    }
}
