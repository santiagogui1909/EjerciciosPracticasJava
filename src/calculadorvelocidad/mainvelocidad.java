package calculadorvelocidad;

import udemy.convertidorapido;

public class mainvelocidad {



		    public static void main(String[] args) {

		        long miles = convertidorapido.toMilesPerHour(10.5);
		        System.out.println("Miles = " + miles);

		        convertidorapido.printConversion(10.5);
		    }
		}