package telran.data;

public class Hockey implements Command {
    private int number = 2;

    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        System.out.println("Hockey starts");
    }
}
