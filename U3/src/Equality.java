
public class Equality {
	/* Erklärung der Ausgabe des Programms:
			Java benutzt das IEEE 754 Standart um floating point Zahlen darzustellen. 
			Nun sind im IEEE 754 Standart nicht alle Zahlen eindeutig darzustellen. Es
			gibt Zahlen mit unendlicher vielen Stellen im Binärformat. In der Regel
			sieht die Binärdarstellung ab einer bestimmten Stelle periodische aus.
			6.5f ist in IEEE 754 eindeutig darstellbar, 6.4f ist nicht in 32bit Stellen darstellbar,
			und deswegen wird das kleinste Bit gerundet. Daraus resultiert natürlich ein geringfügiger Unterschied
			zwischen der 6.4 in IEEE 754 und der 6.4 welche als Zahl im double Format eine doppelt so hohe 
			Genauigkeit besitzt. (double = 64bit; float: 32bit). 6.4 und 6.5 stehen im double-Datentyp, 6.4f und 6.5f im float-Datentyp.
			
	*/
	public static void main(String[] args)
	{

	float number1=6.5f;
	float number2=6.4f;

	if(number1==6.5)
		System.out.println("6.5f und 6.5 sind dasselbe.");
	else
		System.out.println("6.5f und 6.5 sind unterschiedlich.");

	if(number2==6.4)
		System.out.println("6.4f und 6.4 sind dasselbe.");
	else
		System.out.println("6.4f und 6.4 sind unterschiedlich.");
	}
}
