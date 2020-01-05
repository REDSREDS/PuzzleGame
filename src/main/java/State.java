import java.util.HashSet;

public interface State {
    /**
     * estimate distance to goal
     */
    public int estimatedDisGoal();

    /**
     * Iterable all neighbor states
     * @return
     */
    public HashSet<WordState> neighbors();

    /**
     * decide if it is the goal
     */
    public boolean isGoal();

}
