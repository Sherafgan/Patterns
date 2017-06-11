package a_creational.a_singleton;

import java.lang.reflect.Constructor;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/3/17
 */
public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerSingleton instanceOne = EagerSingleton.getInstance();
        EagerSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the a_creational.a_singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
