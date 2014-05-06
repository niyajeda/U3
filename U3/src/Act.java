
public class Act {

	public static void main(String[] args) {
		TransportAuthority a = new TransportAuthority();
		TransportAuthority b = new TransportAuthority();
		a.registerCar("BN-MM 42", "Max Mustermann", "Musterstrasse 42, 101010 Musterstadt");
		b.registerCar("BN-DD 42", "Donald Duck", "Geldspeicher 1, 12345 Entenhausen");
		MeterMaid ma = new MeterMaid();
		ma.checkCar("BN-MM 42");
		ma.fine();
		ma.printTicket();
		MeterMaid mb = new MeterMaid(); 
		mb.checkCar("BN-DD 42");
		mb.fine();
		MeterMaid.printTicket();
	}	
}
