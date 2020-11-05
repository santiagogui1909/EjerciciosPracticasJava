package convertidorbyte;

public class MegaBytesConverter {

		
		public static void printMegaBytesAndKiloBytes ( int KiloBytes  ) {
			
			int megabytes = 0;
			int KB = 0;
			
			megabytes = ( KiloBytes / 1024 );
			
			KB = KiloBytes - ( megabytes * 1024 );
			
			if ( KiloBytes < 0 ) {
				
				System.out.println( "Invalid Value" );
				
			}else{
				
				System.out.println( KiloBytes + "KB= " + 
				megabytes + "MB and " + KB + "KB"   );
			}
		
		}
	 }
