package telran.data;

public class CheapComputerBuilder implements Builder {
    Computer computer;

    @Override
    public Computer getComputer() {
        return computer;
    }

    @Override
    public void buildSystemBlock() {
        computer.setSystemBlock("Windows.10");
    }

    @Override
    public void buildDisplay() {
        computer.setDisplay("Orion");

    }

    @Override
    public void buildManipulators() {
        computer.setManipulators("mouse + keyboard");
    }

    @Override
    public Builder getInstance() {
        computer = new Computer();
        return this;
    }
}
