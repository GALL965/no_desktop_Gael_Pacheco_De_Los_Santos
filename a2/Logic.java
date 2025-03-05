import java.util.List;

public class Logic {
    public static int countMethods(List<String> lines) {
        int methodCount = 0;
        for (String line : lines) {
            if (line.matches(".*\\b(public|private|protected)\\b.*\\(.*\\).*")) {
                methodCount++;
            }
        }
        return methodCount;
    }

    public static int countLines(List<String> lines) {
        int count = 0;
        for (String line : lines) {
            if (!line.trim().isEmpty() && !line.trim().startsWith("//")) {
                count++;
            }
        }
        return count;
    }
}

