public class MinDistance {
    static int[][] minStep;

    public static int minDistance(String start, String goal) {
        minStep = new int[start.length()][goal.length()];
        return minDistance(start, goal, start.length(), goal.length());
    }


    public static int minDistance(String start, String goal, int startLen, int goalLen) {
        /*
        Levenshtein algorithm: recursion: three potential methods: insertion, deletion or replace
        we start from the end of two strings, minStep(n, m), if the end digit are the same then it does not add
        a step, minStep(n,m) = minStep(n-1, m-1), if not, it is either came from insertion, deletion, or replace,
        so and each of them require 1 step, and before insertion, the steps are minStep(n-1, m), because then we add
        1 character to make it n characters, same to the others. So the corresponding minSteps before operation are
        minStep(n-1, m), minStep(n, m-1) and minStep(n-1, m-1). In this way we can write a recursion.
         */
        if(startLen == 0)
            return goalLen;
        if(goalLen == 0)
            return startLen;
        if(minStep[startLen - 1][goalLen - 1] > 0)
            return minStep[startLen - 1][goalLen - 1];
        if(start.charAt(startLen - 1) == goal.charAt(goalLen - 1))
            return minDistance(start, goal, startLen - 1, goalLen - 1);
        minStep[startLen - 1][goalLen - 1] = Math.min(minDistance(start, goal, startLen - 1, goalLen), Math.min(minDistance(start, goal, startLen, goalLen - 1), minDistance(start, goal, startLen - 1, goalLen - 1) )) + 1;
        return minStep[startLen - 1][goalLen - 1];
    }
}
