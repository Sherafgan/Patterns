package a_creational.c_abstract_factory;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/4/17
 */
public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory) {
        return factory.createComputer();
    }
}
