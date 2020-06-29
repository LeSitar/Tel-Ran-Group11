import org.junit.*;

public class WordTransformerTest {
    private WordTransformer wt;

    @Ignore

    @Before
    public void init(){
        wt = new WordTransformer();
        System.out.println("test start");
    }

    @After
    public void end(){
        System.out.println("test over");
    }

    @Test
    public void testWordTransformer(){
        //WordTransformer wt = new WordTransformer();
        String input = "aaa Bdgf bcd OOdd";  //"sdh Ghjsf yuu KKKKlll"
        WordsChecker wc = new ToUpperCase();
        String expected = "AAA Bdgf BCD OOdd";
        String actual = wt.transformWord(input, wc);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testWordTransformerWithStarCase(){
       // WordTransformer wt = new WordTransformer();
        String input = "Fg Jksgksg ut Peyio uu";
        WordsChecker wc = new ToStarCase();
        String expected = "*g Jksgksg *t Peyio *u";
        String actual = wt.transformWord(input, wc);
        Assert.assertEquals(expected,actual);
    }
}
