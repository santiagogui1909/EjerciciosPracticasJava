package switchs;

public class AñoMesDia {

	public static void main(String[] args) {
		
		isLeapYear(2000);
		getDaysInMonth(2,2);
	}

	    public static boolean isLeapYear(int year){
	        if(year >= 1 && year <= 9999){
	            if(year % 4 == 0){
	                if(year % 100 == 0){
	                    if(year % 400 == 0){
	                        return true;
	                    } else{
	                        return false;
	                    }
	                } else{
	                    return true;
	                }
	            } else{
	                return false;
	            }
	        } else {
	            return false;
	        }
	    }
	    
	    public static int getDaysInMonth(int month,int year){
	        if(month<1 || month > 12){
	            return -1;
	        }else if(year < 1  || year > 9999){
	            return -1;
	        }else{
	            switch(month){
	                
	                case 1:{
	                	System.out.println( "el año " + year + " en el mes " + month + " tiene " + 31 + " dias");
	                  
	                }
	                
	                case 2:{
	                    if(isLeapYear(year) == true){
	                    	System.out.println( "el año " + year + " en el mes " + month + " tiene " + 29 + " dias");
	                       
	                    } else{
	                    	System.out.println( "el año " + year + " en el mes " + month + " tiene " + 28 + " dias");
	                        
	                    }
	                }
	                
	                case 3:{
	                	System.out.println( "el año " + year + " en el mes " + month + " tiene " + 31 + " dias");
	                    
	                }
	                
	                case 4:{
	                	System.out.println( "el año " + year + " en el mes " + month + " tiene " + 30 + " dias");
	                    
	                }
	                
	                case 5:{
	                	System.out.println( "el año " + year + " en el mes " + month + " tiene " + 31 + " dias");
	                    
	                }
	                
	                case 6:{
	                	System.out.println( "el año " + year + " en el mes " + month + " tiene " + 30 +  " dias");
	                   
	                }
	                
	                case 7:{
	                	System.out.println( "el año " + year + " en el mes " + month + " tiene " + 31 + " dias");
	                    
	                }
	                
	                case 8:{
	                	System.out.println( "el año " + year + " en el mes " + month + " tiene " + 31 + " dias");
	                    
	                }
	                
	                case 9:{
	                	System.out.println( "el año " + year + " en el mes " + month + " tiene " + 30 + " dias");
	                    
	                }
	                
	                case 10:{
	                	System.out.println( "el año " + year + " en el mes " + month + " tiene " + 31 + " dias");
	                   
	                }
	                
	                case 11:{
	                	System.out.println( "el año " + year + " en el mes " + month + " tiene " + 30 + " dias");
	                    return 30;
	                }
	                
	                case 12:{
	                	System.out.println( "el año " + year + " en el mes " + month + " tiene " + 31 + " dias");
	                    
	                }
	                
	                default:{
	                    return -1;
	                }

	            }
	                      
	        }
	    }
	}
	
