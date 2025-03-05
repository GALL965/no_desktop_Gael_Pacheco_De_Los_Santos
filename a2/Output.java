import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Output {
    public static void writeOutput(int methodCount, int lineCount) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Output.txt"))) {
            bw.write("Numero de Metodos: " + methodCount);
            bw.newLine();
            bw.write("Numero de Lineas: " + lineCount);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error al escribir en Output.txt");
        }
    }
}

