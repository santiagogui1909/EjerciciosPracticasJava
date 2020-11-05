package numerojoven;

public class TeenNumberChecker {
	
	
	public static void main(String[] args) {
		
		TeenNumberChecker.hasTenn(9, 99, 19);

	    TeenNumberChecker.IsTeen(5);
   }
		
   public static void hasTenn(int a , int b , int c) {
	   
	   if ((a >=13 && a <=19) || (b >=13 && b <= 19) || (c >=13 && c <= 19)) {
		   
		  System.out.println("verdadero");
       	} else {
       	  System.out.println("falso");
	    }
   }
	   
	   public static void IsTeen (int uno) {
		   
		   if (uno >=13 && uno <=19) {
			   
			   System.out.println("verdadero");				   			   
		   }else {
		       System.out.println("falso");
	   }
    }
}
