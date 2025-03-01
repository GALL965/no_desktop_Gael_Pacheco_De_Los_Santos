public class Logic {
    public double calculateMean(double[] data) {
        double sum = 0;
        for (double num : data) {
            sum += num;
        }



        return sum / data.length;
    }
  public double calculateStdDev(double[] data, double mean) {
        double sum = 0;
        for (double num : data) {
            sum += Math.pow(num - mean, 2);
        }




        return Math.sqrt(sum / (data.length - 1));
    }
}
