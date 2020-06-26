package telran.data;

public class Director {
    private Builder computerBuilder;

    public void setComputerBuilder(Builder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer() {
        return computerBuilder.getComputer();
    }

    public void constructComputer(){
        computerBuilder.getInstance();
        computerBuilder.buildSystemBlock();
        computerBuilder.buildDisplay();
        computerBuilder.buildManipulators();

    }
}
