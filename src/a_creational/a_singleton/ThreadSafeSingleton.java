package a_creational.a_singleton;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/3/17
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            return new ThreadSafeSingleton();
        } else {
            return instance;
        }
    }

    /**
     * This method provides thread-safe instance initialization
     * with performance gain due to double checked locking principle.
     */
    public static ThreadSafeSingleton getInstanceUsingDoubleCheckedLocking() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    return new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
