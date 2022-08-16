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

        Set<String> point = Set.of("..", "");

        String[] tokens = path.split("/");

        newPath.append("/");
        int i = tokens.length;
        for (String token : tokens) {

            if (!point.contains(token)) {
                newPath.append(token);
                if (!tokens[i - 1].equals(token)) {
                    newPath.append("/");
                }
            }
        }
        return newPath.toString();
    }
}

