package telran.data;

public class FaxDevice implements Faxable{

    @Override
    public void sendFax(String message) {
        System.out.println(message);
    }

    @Override
    public String receiveFax() {
        return "test";
    }
}
