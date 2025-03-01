public class Main {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        double[] column1 = inputHandler.readData("a1/input.txt", 0);
        double[] column2 = inputHandler.readData("a1/input.txt", 1);

        Logic logic = new Logic();
        double mean1 = logic.calculateMean(column1);
        double stdDev1 = logic.calculateStdDev(column1, mean1);
        double mean2 = logic.calculateMean(column2);
        double stdDev2 = logic.calculateStdDev(column2, mean2);

        OutputHandler outputHandler = new OutputHandler();
        outputHandler.writeResults("a1/output.txt", mean1, stdDev1, mean2, stdDev2);
    }
}

