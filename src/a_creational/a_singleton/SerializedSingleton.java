package a_creational.a_singleton;

import java.io.Serializable;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/3/17
 */
public class SerializedSingleton implements Serializable {

    private static final long serialVersionUID = 1234L;
    private static Serializable instance;

    private SerializedSingleton() {
    }

    private static class SingletonHelper {
        private static final SerializedSingleton INSTANCE = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    /**
     * Whenever we deserialize a_creational.a_singleton class, it will create a new
     * instance of the class. This method solves this problem.
     *
     * @see a_creational.a_singleton.SerializedSingletonTest
     */
    protected Object readResolve() {
        return getInstance();
    }
}
