import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        String path = "/home//foo/";
        String path1 = "/home/";
        String path2 = "/../";
        String path3 = "/a/./b/../../c/";

        System.out.println(simplifyPath(path));
        System.out.println(simplifyPath(path1));
        System.out.println(simplifyPath(path2));
        System.out.println(simplifyPath(path3));
    }

    public static String simplifyPath(String path) {

        StringBuilder newPath = new StringBuilder();
        Deque<String> Dq = new ArrayDeque<>();
        Set<String> point = Set.of("..", ".");
        String[] tokens = path.split("/");

        path = Processing(tokens, point);
        AddingToTheStack(path, Dq, point);

        for (String s : Dq) {
            newPath.append(s);
        }
        return newPath.toString();
    }

    public static String Processing(String[] tokens, Set<String> point) {
        String path = "";
        for (int i = 0; i < tokens.length; i++) {

            if (point.contains(tokens[i])) {

                for (int j = 0; j <= i; j++) {
                    tokens[j] = "";
                }
            }
        }

        for (int i = 0; i < tokens.length; i++) {
            path += tokens[i];
        }
        return path;
    }

    public static Deque<String> AddingToTheStack(String path, Deque<String> Dq, Set<String> point) {

        String[] tokens = path.split("/");


        for (String token : tokens) {

            if (!point.contains(token)) {
                Dq.add("/");
                Dq.add(token);
            }
        }

        return Dq;
    }
}


