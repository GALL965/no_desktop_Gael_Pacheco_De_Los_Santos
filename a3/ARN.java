import java.util.HashMap;
import java.util.Map;






public class ARN {





    private static final Map<Character, Character> rnaTranscription = new HashMap<>();

    static {
        rnaTranscription.put('A', 'A');
        rnaTranscription.put('C', 'C');

        rnaTranscription.put('T', 'U');
        rnaTranscription.put('G', 'G');
    }

    public static String transcribirADN(String adn) {
        StringBuilder rna = new StringBuilder();
           for (char base : adn.toCharArray()) {
            rna.append(rnaTranscription.get(base));
        }
        return rna.toString();
    }
}





