package calculadorvelocidad;

public class calculadoraa�o {
	
	public static void isleapyear (int year) {
		
		if (year >= 1 && year < 9999) {  // rango de a�o
			
			System.out.println("valor valido");	
			
		   } else {		   
			   System.out.println("valor no valido");	
		   }
	   
		if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {  //calculador 
			
			System.out.println("El a�o es bisiesto");
	    } else {
			System.out.println("El a�o no es bisiesto");
	}
		
   }
}


