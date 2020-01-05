import org.junit.Test;

public class TestNeighbors {
    @Test
    public void test() {
        String rate = "rate";
        WordState w = new WordState(rate, "rape");
        System.out.println(w.neighbors());
    }
}
