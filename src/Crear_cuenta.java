
public class Crear_cuenta {
	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta();
	
		System.out.println(primeraCuenta.Getsaldo());

		Cuenta segundaCuenta = new Cuenta();
		

		System.out.println(segundaCuenta.getTitular());
		System.out.println(segundaCuenta.Getsaldo());
	}
}
