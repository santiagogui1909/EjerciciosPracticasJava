package metodosobrecarga;

public class segundosYminutos {

	public static void main(String[] args) {
		  
		        System.out.println(getDurationString(68, 45));
		        System.out.println(getDurationString(3945L));          //1.1333333333
		    }

		    private static String getDurationString(long minutes, long seconds) {
		        if((minutes < 0) || (seconds <0) || (seconds > 59)) {
		            return "Invalid value";
		        }

		        long hours = minutes / 60;  
		        long remainingMinutes = minutes % 60;    
		        return hours + "h " +remainingMinutes + "m " + seconds + "s";
		    }

		    private static String getDurationString(long seconds) {
		        if(seconds < 0) {
		            return "Invalid value";
		        }

		        long minutes = seconds / 60;  //61.5
		        long remainingSeconds = seconds % 60;   //62.6333333

		        return getDurationString(minutes, remainingSeconds);
		    }
}