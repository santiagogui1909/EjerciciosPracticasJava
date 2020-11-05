
public class puntajejuego {

	public static void main(String[] args) {
	
		boolean finjuego = true;
		int puntaje=800;
		int nivelcompletado=5;
		int bonus=100;
		
		if (puntaje<5000) {
			System.out.println("tu puntaje es menor a 5000 pero mayor que 1000");
			
		}else if (puntaje < 1000) {			
			System.out.println("tu puntaje fue menos a 1000");
			
			}else{
				System.out.println("vamos sigue");
			}
		
		if (finjuego == true) {
			int puntajefinal = puntaje + (nivelcompletado * bonus);
			
			System.out.println("tu puntaje final es de " + puntajefinal);
		}
		
      boolean nuevofinjuego=true;
      int nuevopuntaje=10000;
      int nuevonivelcompletado=8;
      int nuevobonus=200;
      
      if (nuevofinjuego) {
    	  
    	    int puntajefinal = nuevopuntaje + (nuevonivelcompletado * nuevobonus);
    	    
    	    System.out.println("tu puntaje final es " + puntajefinal);
      }
		
	 }

}
