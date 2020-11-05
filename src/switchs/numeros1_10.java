package switchs;

public class numeros1_10 {

	public static void main(String[] args) {
		   
		   conteo(0);
		   conteo(1);
		   conteo(2);
		   conteo(3);
		   conteo(4);
		   conteo(5);
		   conteo(6);
		   conteo(7);
		   conteo(8);
		   conteo(9);
		   conteo(-10);
		   conteo(50);
		   conteo(110);
		   conteo(-70);
	}	   
		   public static void conteo (int numeros) {
			   
		  switch(numeros) {
        case 0:
            System.out.println("0");
            break;
        case 1:
            System.out.println("1");
            break;
        case 2:
            System.out.println("2");
            break;
        case 3:
            System.out.println("3");
            break;
        case 4:
            System.out.println("4");
            break;
        case 5:
            System.out.println("5");
            break;
        case 6:
            System.out.println("6");
            break;
        case 7:
            System.out.println("7");
            break;
        case 8:
            System.out.println("8");
            break;
        case 9:
            System.out.println("9");
            break;

        default:
            System.out.println("otro numero");
            break;
    }

	}

}
