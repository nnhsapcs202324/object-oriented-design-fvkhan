
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person implements Comparable<Person>
{
    private String name;
    private int age;
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    @Override
    public int compareTo(Person person)
    {
        if (this.name.equals(person.getName()))
        {
            if (this.age > person.getAge())
            {
                return 2;
            }
            
            else
            {
                return 0;
            }
        }
        
        else
        {
            return this.name.compareTo(person.getName());
        }
        
    }
}
