
/**
 * Child
 *
 * @author (Rachit J)
 * @version (3/19/24)
 */
public class Child extends Person
{
    @Override public void eat(){
        System.out.println("Child is eating.");
    }
    @Override public void sleep(){
        System.out.println("Child is sleeping.");
    }
    @Override public void play(){
        System.out.println("Child is playing.");
        eat();
    }
}