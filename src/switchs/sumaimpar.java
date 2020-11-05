package switchs;

public class sumaimpar {

    public static void main(String[] args) {
    	
    	System.out.println("la suma de los numeros es= " + sumOdd(1,10));
    }
		
    	public static boolean isOdd(int numero) {
    		
    		        if(numero < 0){
    		            return false;
    		        } else if(numero % 2 == 1){
    		            return true;
    		        } else {
    		            return false;
    		        }
    		    }
    		    
    		    public static int sumOdd(int star, int end){
    		        
    		        if(end >= star && star > 0 && end > 0){
    		            
    		            int suma = 0;
    		            
    		            for(int i = star; i <= end; i++){
    		                
    		                if(isOdd(i) == true){
    		                    
    		                    suma = suma + i;
    		                       		                    
    		                }
    		            }
    		            return suma;
    		            
    		        } else {
    		            return -1;
    		        }
    		    }
}