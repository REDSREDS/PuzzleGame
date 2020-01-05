import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.ArrayList;

public class PuzzleSolver {
    private static PriorityQueue<SearchNode> pq = new PriorityQueue<>();
    private static Stack<String> ans;
    private static ArrayList<String> traversed = new ArrayList<>();
    /**
     * return a list of worlds in the correct order
     */
    public static SearchNode solver(String start, String goal) {
        SearchNode state = new SearchNode(start, goal, 0, null);
        traversed.add(state.getValue());
        while(!state.isGoal()) {
            SearchNode nextWord = getNextWord(state);
            traversed.add(nextWord.getValue());
            state = nextWord;
        }
        return state;
    }

    public static SearchNode getNextWord(SearchNode state) {
        for(WordState i : state.neighbors()) {
            if((state.getPre() != null) && ( i.getValue().equals(state.getPre().getValue()) || traversed.contains(i.getValue()))) {
                continue;
            }
            pq.add(new SearchNode(i.getValue(), i.getGoal(), state.getSteps() + 1, state));
        }
        return pq.poll();
    }

    public static ArrayList<String> getWorlds(String start, String goal) {
        ArrayList<String> result = new ArrayList<>();
        SearchNode endNode = solver(start, goal);
        ans = new Stack<>();
        while(endNode.getPre() != null) {
            ans.push(endNode.getValue());
            endNode = endNode.getPre();
        }
        ans.push(endNode.getValue());


        while(!ans.empty()) {
            result.add(ans.pop());
        }
        return result;
    }

}
