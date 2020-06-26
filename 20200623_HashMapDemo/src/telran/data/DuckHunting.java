package telran.data;

public class DuckHunting implements Command{
    private int number = 3;

    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        System.out.println("Hunting starts");
    }
}
