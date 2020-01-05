import org.junit.Test;
public class TestPuzzleSolver {

    @Test
    public void test() {
        String start = "lug";
        String goal = "sleep";
        System.out.println(PuzzleSolver.getWorlds(start, goal));
    }
}
