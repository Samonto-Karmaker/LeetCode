// Convert the Temperature

class Solution {
    public double[] convertTemperature(double celsius) {
        double[] temp = {celsius + 273.15, celsius * 1.80 + 32};
        return temp;
    }
}