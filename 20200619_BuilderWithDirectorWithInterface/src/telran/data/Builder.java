package telran.data;

public interface Builder {

    void buildSystemBlock();
    void buildDisplay();
    void buildManipulators();
    Builder getInstance();
    Computer getComputer();
}
