import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        String path = "/a/../../b/../c//.//";
        String path1 = "/home//foo/";
        String path2 = "/../";
        String path3 = "/a/./b/../../c/";
        String path4 = "/a//b////c/d//././/..";

        System.out.println(simplifyPath(path));
        System.out.println(simplifyPath(path1));
        System.out.println(simplifyPath(path2));
        System.out.println(simplifyPath(path3));
        System.out.println(simplifyPath(path4));
    }

    public static String simplifyPath(String path) {

        Deque<String> Dq = new ArrayDeque<>();
        Set<String> point = Set.of("..");
        String[] tokens = path.split("/");

        path = String.valueOf(Processing(tokens, Dq, point));

        return path;
    }

    public static StringBuilder Processing(String[] tokens, Deque<String> Dq, Set<String> point) {
        StringBuilder path = new StringBuilder();
        for (String token : tokens) {
            if (point.contains(token)) {
                Dq.pollLast();
                Dq.pollLast();
                Dq.pollLast();
                Dq.pollLast();
                Dq.pollLast();
                Dq.pollLast();
            } else if (!Objects.equals(token, "")) {
                Dq.add("/");
                Dq.add(token);
            }

        }
        int Size = Dq.size();

        while (Size > 1 && Dq.getLast().equals("/") || Size > 1 && Dq.getLast().equals(".")) {
            Dq.pollLast();
        }

        for (String s : Dq) {
            if (!s.equals("") && !Objects.equals(s, ".")) {
                path.append(Dq.poll());
            }

        }
        if (path.toString().equals("")) return path.append("/");
        return new StringBuilder(path.toString());
    }
}


