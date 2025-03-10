nucleotides = ["A", "C", "T", "G"]
nucl_complement = {"A": "T", "C": "G", "T": "A", "G": "C"}
rna_transcription = {"A": "A", "C": "C", "T": "U", "G": "G"}


aminoacidos = {



    "UUU": "F","UUC": "F","UUA": "L","UUG": "L","UCU": "S","UCC": "S","UCA": "S","UCG": "S",
    "UAU": "Y","UAC": "Y","UAA": "","UAG": "","UGU": "C","UGC": "C","UGA": "","UGG": "W",
    "CUU": "L","CUC": "L","CUA": "L","CUG": "L","CCU": "P","CCC": "P","CCA": "P","CCG": "P",
    "CAU": "H","CAC": "H","CAA": "Q","CAG": "Q","CGU": "R","CGC": "R","CGA": "R","CGG": "R",
    "AUU": "I","AUC": "I","AUA": "I","AUG": "M","ACU": "T","ACC": "T","ACA": "T","ACG": "T",
    "AAU": "N","AAC": "N","AAA": "L","AAG": "L","AGU": "S","AGC": "S","AGA": "R","AGG": "R",
    "GUU": "V","GUC": "V","GUA": "V","GUG": "V","GCU": "A","GCC": "A","GCA": "A","GCG": "A",
    "GAU": "D","GAC": "D","GAA": "E","GAG": "E","GGU": "G","GGC": "G","GGA": "G","GGG": "G"
}

def main():
    dna = ""
    rna = ""
    frames = []
    proteins = []
    with open("covid19.txt", "r") as f:
        for x in f:
            dna += x.strip()
    dna = dna.upper()
    for base in dna:
        rna += rna_transcription[base]
    n = len(rna)
    for c in range(3):
        frame_start = False
        myframe = ""
        for i in range(c, n, 3):
            codon = rna[i:i+3]
            if len(codon) < 3:
                break
            if codon == "AUG" and not frame_start:
                frame_start = True
                myframe = "AUG"
            elif frame_start:
                if codon in ["UAA","UAG","UGA"]:
                    frame_start = False
                    frames.append(myframe)
                    myframe = ""
                else:
                
                
                
                
                
                    myframe += codon
    with open("resultados.txt", "w") as out:
        orf_count = 0
        for i, frame in enumerate(frames):
            protein = ""
            for j in range(0, len(frame), 3):
                cod = frame[j:j+3]
                protein += aminoacidos[cod]
            if len(protein) == 75:
                orf_count += 1
                
                
                
                out.write(f"ORF con 75 aminoácidos ({orf_count}):\n")
                out.write(f"- Secuencia ARN: {frame}\n")
                out.write(f"- Longitud nucleótidos: {len(frame)}\n")
                out.write(f"- Proteína: {protein} (75 aa)\n\n")
        out.write("proceso compltado.\n")



if __name__ == "__main__":
    main()

