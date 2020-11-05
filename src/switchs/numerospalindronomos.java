package switchs;

public class numerospalindronomos {

     public static void main(String[] args) {
		
    	 System.out.println("es un numero palindronomo= " + isPalindrome(123));
     }
    
     
     public static boolean isPalindrome (int numero) {
     
         int reverso = 0;
         int num = numero;
         
         while(num!=0){
             
             int lastDigit = num % 10;
             
             reverso = (reverso * 10)+ lastDigit;
             
             num = num / 10;
         }
         
         if(reverso == numero){
             return true;
         } else{
             return false;
         }
     }		
}
    	 
