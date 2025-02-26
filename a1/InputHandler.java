import java.io.*;
import java.util.ArrayList;

public class InputHandler {
    public double[] readData(String fileName, int columnIndex) {
        ArrayList<Double> dataList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();







                if (line.isEmpty()) continue; 
                
                String[] parts = line.split("\\s+");
                if (columnIndex < parts.length) {
                    try {

                        dataList.add(Double.parseDouble(parts[columnIndex]));

                    } catch (NumberFormatException e) {
                        System.err.println("Advertencia: No se pudo convertir '" + parts[columnIndex] + "' a numero.");
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

         return dataList.stream().mapToDouble(Double::doubleValue).toArray();
    }
}

