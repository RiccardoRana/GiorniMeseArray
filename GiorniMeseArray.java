import java.util.Scanner;

public class GiorniMeseArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] mesi = {"Gennaio","Febbraio","Marzo","Aprile","Maggio","Giugno","Luglio","Agosto","Settembre","Ottobre","Novembre","Dicembre"};
        System.out.print("Inserisci un numero da 1 a 12 e ti dirò il mese corrispondente e il numero di giorni: ");
	    int meseScelto = in.nextInt();
	    int giorni=0;
	    switch (meseScelto) {
		  case 1:
		    giorni=31;
		    break;
		  case 2:
		    giorni=28;
		    break;
		  case 3:
		   giorni=31;
		    break;
		  case 4:
		    giorni=30;
		    break;
		  case 5:
		    giorni=31;
		    break;
		  case 6:
		    giorni=30;
		    break;
		  case 7:
		    giorni=31;
		    break;
		  case 8:
			  giorni=31;
			    break;
		  case 9:
			  giorni=31;
			    break;
		  case 10:
			  giorni=31;
			    break;
		  case 11:
			  giorni=30;
			    break;
		  case 12:
			  giorni=31;
			    break;
			    default: 
			    	 System.out.println("Errore!");
			    	 
		}
	    
	    
	    
	    
	    
	    System.out.println("Il mese di "+mesi[meseScelto-1]+" ha "+giorni+" giorni!");
	
	in.close();
	}
}
