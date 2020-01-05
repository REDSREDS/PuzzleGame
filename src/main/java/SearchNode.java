public class SearchNode extends WordState implements Comparable<SearchNode>  {
    private int steps;
    private SearchNode pre;
    public SearchNode(String start, String goal, int steps, SearchNode pre) {
        super(start, goal);
        this.steps = steps;
        this.pre = pre;
    }


    @Override
    public int compareTo(SearchNode temp) {
        return (this.estimatedDisGoal() + this.steps) - (temp.estimatedDisGoal() +temp.steps);
    }

    public int getSteps() {
        return steps;
    }

    public SearchNode getPre() {
        return pre;
    }

}
