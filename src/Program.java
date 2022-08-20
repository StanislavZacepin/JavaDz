import java.util.*;

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

        List<String> Array = new ArrayList<>();
        Set<String> point = Set.of(".","");
        String[] tokens = path.split("/");

        path = String.valueOf(Processing(tokens, Array, point));

        return path;
    }

    public static StringBuilder Processing(String[] tokens, List<String> Array, Set<String> point) {
        StringBuilder path = new StringBuilder("/");


        for (String s : tokens) {
            if(s.equals("..")){
                if (Array.size() > 0 ) {
                    Array.remove(Array.size() - 1);
                }

            }
            else if (!point.contains(s)) {
                Array.add(s);
            }

        }
        for(String p : Array) {
            path.append(p).append("/");
        }
        if(path.length() > 1) {
            return new StringBuilder(path.substring(0, path.length() - 1));
        }

        return new StringBuilder(path.toString());
    }
}


