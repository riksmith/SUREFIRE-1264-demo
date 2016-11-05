/**
 * Created by Rik Smith on 5-11-2016.
 */

import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

public abstract class AbstractTest {

    @Parameterized.Parameters()
    public static List<String> getEnvironments() {
        return Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");

    }
}
