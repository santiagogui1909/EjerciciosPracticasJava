package switchs;

public class sumapares1 {
	
	public static void main(String[] args) {

	  System.out.println("la suma de los numeros pares es = " + getEvenDigitSuma(123456789));
}
    public static int getEvenDigitSuma(int numero){
        if(numero >= 0){
            
            int num = numero;
            
            int suma = 0;
                
            while(numero != 0){
                
                num = numero % 10;
                numero = numero / 10;
                
                if(num % 2 == 0){
                    suma = suma + num;
                }
            }
            return suma;
        }else{
            
            return -1;
        }
    }
}


