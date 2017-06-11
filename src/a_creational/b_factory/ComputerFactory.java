package a_creational.b_factory;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/3/17
 */
public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if (type.equalsIgnoreCase("PC")) {
            return new PC(ram, hdd, cpu);
        } else if (type.equalsIgnoreCase("Server")) {
            return new Server(ram, hdd, cpu);
        }
        return null;
    }
}
