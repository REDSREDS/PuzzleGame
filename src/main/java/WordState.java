import java.util.HashSet;


public class WordState implements State {
    private String value;
    private String goal;
    private HashSet<WordState> neighbors = new HashSet<>();
    private int distance = -1;
    /**
     * constructor
     */
    public WordState(String value, String goal) {
        this.value = value;
        this.goal = goal;
    }

    /**
     * Levenshtein algorithm
     * @return
     */
    public int estimatedDisGoal() {
            distance = MinDistance.minDistance(value, goal);
        return distance;
    }

    /**
     * return a collection of neighboring WordStates
     * @return collection
     */
    @Override
    public HashSet<WordState> neighbors() {
        HashSet<String> words = Start.getWords();
        for(String word : words) {
            if(MinDistance.minDistance(this.value, word) == 1)
                neighbors.add(new WordState(word, goal));
        }
        return neighbors;
    }

    /**
     * decide if it is the goal
     * @return
     */
    public boolean isGoal() {
        return estimatedDisGoal() == 0;
    }



    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getValue();
    }

    public String getGoal() {
        return goal;
    }



}
