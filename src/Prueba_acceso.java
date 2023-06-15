
public class Prueba_acceso {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();

		cuenta.depositar(400);
		cuenta.retirar(1000);
		cuenta.setAgencia(22);
		cuenta.setNumero(500);

		System.out.println(cuenta.Getsaldo());
		System.out.println(cuenta.getAgencia());
		System.out.println(cuenta.getNumero());

	}

}
