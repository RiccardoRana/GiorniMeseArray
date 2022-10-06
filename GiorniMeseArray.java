import java.util.Scanner;

public class GiorniMeseArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] mesi = { "Gennaio", "Febbraio", "Marzo", "Aprile", "Maggio", "Giugno", "Luglio", "Agosto", "Settembre",
				"Ottobre", "Novembre", "Dicembre" };
		int[] giorni = { 31, 28, 31, 31, 30, 31, 30, 31, 31, 31, 30, 31 };
		System.out.print("Inserisci un numero da 1 a 12 e ti dirò il mese corrispondente e il numero di giorni: ");
		int meseScelto = in.nextInt();

		System.out.println("Il mese di " + mesi[meseScelto - 1] + " ha " + giorni[meseScelto] + " giorni!");

		in.close();
	}
}
