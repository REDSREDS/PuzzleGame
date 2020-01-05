import org.junit.Test;
import static org.junit.Assert.*;

public class TestMinDistance {

    @Test
    public void test() {
        String start = "edward";
        String goal = "edwin";
        assertEquals(3, MinDistance.minDistance(start, goal));
    }
}
