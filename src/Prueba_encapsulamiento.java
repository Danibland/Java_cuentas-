
public class Prueba_encapsulamiento {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		Cliente cliente = new Cliente();

		cliente.setNombre("daniel");
		cliente.setDocumento("1035865589");
		cliente.setTelefono("3006276182");
		
		cuenta.setTitular(cliente);
		
		System.out.println(cliente.getNombre());
		System.out.println(cuenta.getTitular().getNombre());
		
		
		
		

	}

}
