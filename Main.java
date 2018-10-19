public class Main {

    public static void main(String[] args) {
        //work1
        int x = 123;
        System.out.println("h " + (x%1000-x%100)/100 + "  d " + (x%100-x%10)/10 + "  u " + x%10);
        //work2
        double temperatureInCelsius = 10;
        double Fahrenheit  = temperatureInCelsius * 33.8;
        double Kelvin = temperatureInCelsius *274.15;
        System.out.println("Celsius:"+temperatureInCelsius);
        System.out.println("Fahrenheit:"+Fahrenheit);
        System.out.println("Kelvin:"+Kelvin);

        //work3
        double a = 10;
        double b = 10;
        double c = 10;
        double p = 10;
        System.out.println(a*p*p + b*p + c);
        //work5
        int s = 50000;
        int hours = s / 3600;
        int minutes = (s % 3600) / 60;
        int seconds = s % 60;
        System.out.println(hours + "ч " + minutes + "мин " + seconds+ "сек ");

    }
}
