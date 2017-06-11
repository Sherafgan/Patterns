package a_creational.c_abstract_factory;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/4/17
 */
public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}
