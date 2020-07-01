import java.util.LinkedList;

public class Demo1 {
    public static void main(String[] args) {
        Body body = new Body();
        SmallHead smallHead = new SmallHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();

        Robot<SmallHead> robot1 = new Robot<>(body, smallHead);
        Robot robot2 = new Robot(body, mediumHead);

        Leg leg = new Leg();

        Robot<BigHead> robot3 = new Robot(body,bigHead);


    }

}
