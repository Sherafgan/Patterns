package a_creational.a_singleton;

import java.io.*;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/3/17
 */
public class SerializedSingletonTest {
    private static final String SERIALIZATION_PATH = "files/a_creational.a_singleton.ser";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(SERIALIZATION_PATH));
        out.writeObject(instanceOne);
        out.close();

        //deserializing from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(SERIALIZATION_PATH));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("To be serialized's hashcode:  " + instanceOne.hashCode());
        System.out.println("Deserialized's hashcode:      " + instanceTwo.hashCode());
    }
}
