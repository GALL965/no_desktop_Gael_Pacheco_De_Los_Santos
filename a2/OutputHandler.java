import java.io.*;

public class OutputHandler {
    public void writeResults(String fileName, double mean1, double stdDev1, double mean2, double stdDev2) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Tabla 1: Columna1\n");

            writer.write("Media: " + mean1 + "\n");
            writer.write("desviacion estandar: " + stdDev1 + "\n\n");
            writer.write("Table 1: Column 2\n");
            writer.write("Media: " + mean2 + "\n");
            writer.write("desviacion estandar: " + stdDev2 + "\n");
            System.out.println("Resultados guardados en " + fileName);
        } catch (IOException e) {
            System.err.println("error al escribir en el archivo de salida: " + e.getMessage());
        }
    }
}


