package switchs;

public class sumaultimoprimer {
	
	public static void main(String[] args) {
		
		System.err.println("la suma del primer y ultimo numero es= " + sumaPrimerUltimoDijito(94449));
	}
                                                                                       
	public static int sumaPrimerUltimoDijito(int numero) {
		
		        if(numero >= 10){
		            int lastDigit = numero % 10;
		            while(numero > 9){
		                numero = numero / 10;
		            }
		            return (lastDigit + numero);
		        }else if(numero>=0 && numero <10 ){
		            return (numero + numero);
		        }else{
		            return -1;
		        }
		    }		
	}

