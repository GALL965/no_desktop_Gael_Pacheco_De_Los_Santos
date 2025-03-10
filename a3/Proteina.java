import java.util.HashMap;
import java.util.Map;

public class Proteina {
    private static final Map<String, String> aminoacidos = new HashMap<>();




    static {
        aminoacidos.put("UUU", "F"); aminoacidos.put("UUC", "F"); aminoacidos.put("UUA", "L"); aminoacidos.put("UUG", "L");
        aminoacidos.put("UCU", "S"); aminoacidos.put("UCC", "S"); aminoacidos.put("UCA", "S"); aminoacidos.put("UCG", "S");
        aminoacidos.put("UAU", "Y"); aminoacidos.put("UAC", "Y"); aminoacidos.put("UAA", ""); aminoacidos.put("UAG", "");
        aminoacidos.put("UGU", "C"); aminoacidos.put("UGC", "C"); aminoacidos.put("UGA", ""); aminoacidos.put("UGG", "W");
        aminoacidos.put("CUU", "L"); aminoacidos.put("CUC", "L"); aminoacidos.put("CUA", "L"); aminoacidos.put("CUG", "L");
        aminoacidos.put("CCU", "P"); aminoacidos.put("CCC", "P"); aminoacidos.put("CCA", "P"); aminoacidos.put("CCG", "P");
        aminoacidos.put("CAU", "H"); aminoacidos.put("CAC", "H"); aminoacidos.put("CAA", "Q"); aminoacidos.put("CAG", "Q");
        aminoacidos.put("CGU", "R"); aminoacidos.put("CGC", "R"); aminoacidos.put("CGA", "R"); aminoacidos.put("CGG", "R");
        aminoacidos.put("AUU", "I"); aminoacidos.put("AUC", "I"); aminoacidos.put("AUA", "I"); aminoacidos.put("AUG", "M");
        aminoacidos.put("ACU", "T"); aminoacidos.put("ACC", "T"); aminoacidos.put("ACA", "T"); aminoacidos.put("ACG", "T");
        aminoacidos.put("AAU", "N"); aminoacidos.put("AAC", "N"); aminoacidos.put("AAA", "L"); aminoacidos.put("AAG", "L");
        aminoacidos.put("AGU", "S"); aminoacidos.put("AGC", "S"); aminoacidos.put("AGA", "R"); aminoacidos.put("AGG", "R");
        aminoacidos.put("GUU", "V"); aminoacidos.put("GUC", "V"); aminoacidos.put("GUA", "V"); aminoacidos.put("GUG", "V");
        aminoacidos.put("GCU", "A"); aminoacidos.put("GCC", "A"); aminoacidos.put("GCA", "A"); aminoacidos.put("GCG", "A");
        aminoacidos.put("GAU", "D"); aminoacidos.put("GAC", "D"); aminoacidos.put("GAA", "E"); aminoacidos.put("GAG", "E");
        aminoacidos.put("GGU", "G"); aminoacidos.put("GGC", "G"); aminoacidos.put("GGA", "G"); aminoacidos.put("GGG", "G");
    }




    public static String traducirProteina(String frame) {
        StringBuilder proteina = new StringBuilder();
        for (int i = 0; i < frame.length(); i += 3) {
    

            String codon = frame.substring(i, Math.min(i + 3, frame.length()));
            proteina.append(aminoacidos.getOrDefault(codon, ""));
        }
       




        return proteina.toString();
    }
}

