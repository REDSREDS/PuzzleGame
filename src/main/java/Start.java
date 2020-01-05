
import java.util.HashSet;
import java.io.*;
import java.util.List;
import java.util.Scanner;


public class Start {

    private static final String wordFile = "src/main/resources/words.txt";
    private static HashSet<String> words;

    /**
     * main function
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        define the start and the goal
        System.out.println("Please input a word to begin with: ");
        String start = sc.nextLine();
        System.out.println("Please input a word you want to transform to: ");
        String goal = sc.nextLine();
        System.out.println("transforming...");

//        get the answer
        List<String> ans = PuzzleSolver.getWorlds(start, goal);

//        Print the answer
        System.out.println("The transforming procedure is below: ");
        System.out.println(ans);

    }

    public static HashSet<String> getWords() {
        words = new HashSet<String>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(wordFile));
            String current;
            while ((current = in.readLine()) != null) {
                words.add(current.toLowerCase());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return words;
    }

}
