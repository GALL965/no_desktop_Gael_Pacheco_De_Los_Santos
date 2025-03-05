public class Logic {
    public double getMean(double[] data) {
        double sum = 0;
        for (double x : data) {
            sum += x;
        }
        return sum / data.length;
    }

    public double getStdDev(double[] data, double mean) {
        double sum = 0;
        for (double x : data) {
            sum += Math.pow(x - mean, 2);
        }
        return Math.sqrt(sum / (data.length - 1));
    }
}
