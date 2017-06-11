package a_creational.c_abstract_factory;

/**
 * @author Sherafgan Kandov (sherafgan.kandov@gmail.com)
 * @version 6/4/17
 */
public abstract class Computer {

    public abstract String getRAM();

    public abstract String getHDD();

    public abstract String getCPU();

    @Override
    public String toString() {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU();
    }
}
