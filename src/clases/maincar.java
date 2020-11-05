package clases;

public class maincar {	
    public static void main(String[] args) {
    	
	    car porsche = new car();
        car holden = new car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}


