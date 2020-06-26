package telran.data;

public class Football  implements Command{
    private int number = 1;

    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        System.out.println("Football starts");
    }
}
