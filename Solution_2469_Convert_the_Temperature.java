import java.util.Arrays;

public class Solution_2469_Convert_the_Temperature {
    public static void main(String[] args) {
        double celsius = 36.50;
        System.out.println(Arrays.toString(convertTemperature(celsius)));
    }
    static public double[] convertTemperature(double celsius) {
        double kelvin = celsius+273.15;
        double fahrenheit = celsius * 1.80 + 32.00;
        return new double[]{kelvin, fahrenheit};
    }
}
