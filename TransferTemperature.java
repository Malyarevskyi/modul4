package dz4_2;

public class TransferTemperature {

    public static void main(String[] args) {
        System.out.println(CelsiusToFahrenheit());
        System.out.println(FahrenheitToCelsius());
    }

    public static double CelsiusToFahrenheit () {
        double c=25;
        return (1.8*c+32);
    }
    public static double FahrenheitToCelsius (){
        double f=77;
        return ((f-32)/1.8);
    }
}
