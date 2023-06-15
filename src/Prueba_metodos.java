
public class Prueba_metodos {

	public static void main(String[] args) {
		Cuenta cuentadaniel = new Cuenta();
		Cuenta cuentaadriana = new Cuenta();

		cuentadaniel.depositar(200);
		cuentadaniel.depositar(5000);
		cuentaadriana.depositar(1000);
		cuentadaniel.transferir(1500, cuentaadriana);
		cuentaadriana.transferir(100,cuentadaniel);

		System.out.println( "daniel tu saldo es: "+cuentadaniel.Getsaldo());
		System.out.println( "adriana tu saldo es: "+cuentaadriana.Getsaldo());
	}
}
