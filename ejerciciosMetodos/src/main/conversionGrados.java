package main;

public class conversionGrados {

	public static void main(String[] args) {
		System.out.println("30ºC a Fahrenheit: "+celsiusFahrenheit(30)+ "ºF");
		System.out.println("86ºF a Celsius: "+fahrenheitCelsius(86)+"ºC");

	}

	private static double fahrenheitCelsius(double fahrenheit) {
		return (fahrenheit - 32)*5/9;
	}

	private static double celsiusFahrenheit(double celsius) {
		return (celsius * 9/5)+32;
	}

}
