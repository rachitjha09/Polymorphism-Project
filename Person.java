
/**
 * Person
 *
 * @author (Rachit J)
 * @version (3/19/24)
 */
public class Person
{
    public void eat(){
        System.out.println("Person is eating.");
    }
    public void sleep(){
        System.out.println("Person is sleeping.");
    }
    public void play(){
        System.out.println("Person is playing.");
        eat();
    }
}