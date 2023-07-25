package org.step;

import java.util.Scanner;

public class Sample {
	 public static String getWeatherData() {
	       
	        return "{ \"temperature\": 25, \"wind_speed\": 10, \"pressure\": 1015 }";
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("1. Get weather");
	            System.out.println("2. Get Wind Speed");
	            System.out.println("3. Get Pressure");
	            System.out.println("0. Exit");

	            System.out.print("Enter your choice: ");
	            int option = scanner.nextInt();

	            switch (option) {
	                case 1:
	                    
	                    String weatherData = getWeatherData();
	                    
	                    int temperature = 0; 
	                    System.out.println("Temperature: " + temperature + "°C");
	                    break;

	                case 2:
	                    
	                    String windData = getWeatherData();
	                    
	                    int windSpeed = 0; 
	                    System.out.println("Wind Speed: " + windSpeed + " m/s");
	                    break;

	                case 3:
	                    
	                    String pressureData = getWeatherData();
	                    
	                    int pressure = 0; 
	                    System.out.println("Pressure: " + pressure + " hPa");
	                    break;

	                case 0:
	                    System.out.println("Exiting the program.");
	                    scanner.close();
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid option. Please enter a valid option.");
	            }
	        }
	    }
	}


