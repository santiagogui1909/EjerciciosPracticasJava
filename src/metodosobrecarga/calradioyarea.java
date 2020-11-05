package metodosobrecarga;

public class calradioyarea {
		
		     public static double area(double radius){
		         if (radius < 0){
		        	 
		             return area(5.0);
		         }
        
		        double arearectangulo =radius*radius*Math.PI;
		         return 1;
		         
		         
		     }
		     
		     public static double area(double x,double y){
		         if(x < 0 || y< 0){
		             return -1.0;
		         }
		         return x*y;
		     }
	   
	}

