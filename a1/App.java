public class App {
    public static void main(String[] args) {
        Input input = new Input();
        double[] data = input.readData("input.txt");
        Logic logic = new Logic();
        double mean = logic.getMean(data);
        double stddev = logic.getStdDev(data, mean);
        Output output = new Output();
        output.writeData("output.txt", mean, stddev);
    }
}
