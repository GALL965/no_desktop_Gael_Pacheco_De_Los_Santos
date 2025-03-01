import java.io.*;
import java.lang.reflect.Method;

public class MainInspector {
    public static void main(String[] args) {
    
        File currentDir = new File(".");
        File[] javaFiles = currentDir.listFiles((dir, name) -> name.endsWith(".java") && !name.equals("MainInspector.java"));
        
        if (javaFiles != null) {
            for (File file : javaFiles) {
               
                int lineCount = 0;
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    while (br.readLine() != null) {
                        lineCount++;
                    }
                } catch (IOException e) {
                    System.err.println("error al leer " + file.getName() + ": " + e.getMessage());
                }
                
               int methodCount = 0;
                String className = file.getName().replace(".java", "");
                try {
                    Class<?> clazz = Class.forName(className);
                    Method[] methods = clazz.getDeclaredMethods();
                    methodCount = methods.length;
                } catch (ClassNotFoundException e) {
                    System.err.println("Clase " + className + " no encontrada.");
                }
                
             





                System.out.println("Archivo: " + file.getName() +
                                   " | Lineas: " + lineCount +
                                   " | metodos: " + methodCount);
            }
        } else {
            System.err.println("No se encontraron archivos ");
        }
    }
}

