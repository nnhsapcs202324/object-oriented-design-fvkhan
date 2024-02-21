import java.util.Scanner;
import java.util.ArrayList;
public class PersonDemo
{
    public static void main (String args[])
    {
        ArrayList<Person> list = new ArrayList<Person>();
        Scanner s = new Scanner(System.in);
        for (int i = 0; i<3; i++)
        {
            System.out.print("Enter a name: ");
            String name = s.next();
            System.out.print("Enter an age: ");
            int age = s.nextInt();
            Person p = new Person(name,age);
            list.add(p);
        }
        Person first = list.get(0);
        Person last = list.get(0);
        for (int i = 1; i < list.size(); i++)
        {
            if (first.compareTo(list.get(i))==2)
            {
                continue;
            }
            else if (first.compareTo(list.get(i))>0)
            {
                first = list.get(i);
            }
        }
       
        for (int i = 1; i < list.size(); i++)
        {
            System.out.println(last.compareTo(list.get(i)));
            if (last.compareTo(list.get(i))==2)
            {
                last = list.get(i);
            }
            else if (last.compareTo(list.get(i))<0)
            {
                continue;
            }
        }
       
        System.out.println(first.getName());
        System.out.println(first.getAge());
        System.out.println(last.getName());
        System.out.println(last.getAge());
    }
}