import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Rik Smith on 5-11-2016.
 */
@RunWith(Parameterized.class)
public class Test8 extends AbstractTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(Test8.class);

    private String string;

    public Test8(String s1) {
        this.string = s1;
    }

    @Test
    public void test1() {
        LOGGER.info("test: " + string);
        Assert.assertNotEquals("d", string);
        Assert.assertNotEquals("f", string);
    }
}
