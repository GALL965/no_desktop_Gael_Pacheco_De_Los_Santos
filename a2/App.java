import java.util.List;

public class App {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java App archivo_entrada.java");
            return;
        }

        String inputFile = args[0];

        List<String> lines = Input.readFile(inputFile);
        int methodCount = Logic.countMethods(lines);
        int lineCount = Logic.countLines(lines);

        Output.writeOutput(methodCount, lineCount);
        System.out.println("Proceso terminado, revisa Output.txt");
    }
}

