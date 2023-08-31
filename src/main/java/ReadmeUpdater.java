import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadmeUpdater {
    private static final String PATH = "README.md";

    public static void main(String[] args) throws IOException {
        updateStatistics();
    }

    private static void updateStatistics() throws IOException {
        Path path = Paths.get(PATH);
        int problemCounter = -2;
        int asteriskCounter = 0;
        List<String> lines = Files.readAllLines(path);
        for (String line : lines) {
            if (line.startsWith("|")) {
                problemCounter++;
                if (line.contains("*")) {
                    asteriskCounter++;
                }
            }
        }
        double solvedMyselfProblems = (double) problemCounter - asteriskCounter;
        String prepareNewString = String.format("Solve myself %.0f/%d = %.0f%%", solvedMyselfProblems, problemCounter, solvedMyselfProblems / problemCounter * 100);
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).contains("Solve myself")) {
                lines.set(i, prepareNewString);
                break;
            }
        }
        Files.write(path, lines, StandardCharsets.UTF_8);
    }
}
