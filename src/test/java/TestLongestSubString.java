import org.junit.Test;
import static org.junit.Assert.*;
public class TestLongestSubString {

    @Test
    public void test1() {
        int[] arr = {3,1,3,4};
        assertEquals(3, LongestSubString.traverse(arr));
    }
}
