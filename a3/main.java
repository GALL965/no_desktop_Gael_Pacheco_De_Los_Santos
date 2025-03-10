import java.io.*;
import java.util.List;

public class main {
    public static void main(String[] args) {
        StringBuilder dna = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("covid19.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                dna.append(line.trim().toUpperCase());
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
            return;
        }

        String rna = ARN.transcribirADN(dna.toString());
        List<String> frames = ORF.encontrarMarcos(rna);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("resultados.txt"))) {
            int orfCount = 0;
            for (String frame : frames) {
                String protein = Proteina.traducirProteina(frame);
                if (protein.length() == 75) {
                    orfCount++;
                    bw.write("ORF con 75 aminoacidos (" + orfCount + "):\n");
                    bw.write("- Secuencia ARN: " + frame + "\n");
                    bw.write("- Longitud nucleotidos: " + frame.length() + "\n");
                    bw.write("- Proteina " + protein + " (75)\n\n");
                }
            }
            bw.write("roceso completado\n");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}

