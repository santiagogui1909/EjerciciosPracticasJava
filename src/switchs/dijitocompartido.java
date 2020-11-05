package switchs;

public class dijitocompartido {
	public static void main(String[] args) {
		
		System.err.println("el dijito compartido es " + hasSharedDigit(9, 62));
	}
	    public static boolean hasSharedDigit(int start, int end){
	        if(start >= 10 && start <= 99 && end >= 10 && end <=99){
	            int startCount = start;
	            int endCount = end;
	            
	            while(startCount > 10 && endCount > 10){
	                startCount = startCount / 10;
	                endCount = endCount / 10;
	                start = start % 10;
	                end = end % 10;
	            }
	            
	            if(startCount == end || startCount == start || startCount == endCount){
	                return true;
	            }else if(endCount == start || endCount == end || start == end){
	                return true;
	            }else{
	                return false;
	            }
	            
	            }else{
	            return false;
	        }
	    }
	}
