package a_creational.a_singleton;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/3/17
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            return new LazyInitializedSingleton();
        } else {
            return instance;
        }
    }
}
