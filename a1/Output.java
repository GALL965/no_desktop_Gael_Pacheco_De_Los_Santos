import java.io.*;

public class Output {
    public void writeData(String filename, double mean, double stddev) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("Tabla:\n");
            bw.write("Media | desviacion estandar\n");
            bw.write(String.format("%.1f | %.2f\n", mean, stddev));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

