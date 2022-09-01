public class TemperatureConversion {
  public static double tofahrenheit(double celsius){
     return ( celsius * (9.0/5.0) + 32 );
  }

  public static void main(String[] args) {
     double celsius = 0.0;
     double fahrenheit = 0.0;
     celsius = 32;

     fahrenheit = tofahrenheit(celsius);
     System.out.println("Celsius is = "+celsius);

     System.out.println("Convertion to fahrenheit is = "
                         +fahrenheit);
                        
  }
}