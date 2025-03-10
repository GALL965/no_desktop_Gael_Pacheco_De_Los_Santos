import java.util.ArrayList;
import java.util.List;



public class ORF {
    public static List<String> encontrarMarcos(String rna) {
        List<String> frames = new ArrayList<>();


        int n = rna.length();

        for (int c = 0; c < 3; c++) {
            boolean frameStart = false;
            StringBuilder myframe = new StringBuilder();

            for (int i = c; i < n; i += 3) {
                if (i + 3 > n) break;
                String codon = rna.substring(i, i + 3);

        


                if (codon.equals("AUG") && !frameStart) {
                    frameStart = true;
                    myframe = new StringBuilder("AUG");
                } else if (frameStart) {
                    if (codon.equals("UAA") || codon.equals("UAG") || codon.equals("UGA")) {
                        frameStart = false;
                        frames.add(myframe.toString());
                        myframe = new StringBuilder();
        
                    } else {
                        myframe.append(codon);
                    }
                }
            }
        }











        return frames;
    }
}




