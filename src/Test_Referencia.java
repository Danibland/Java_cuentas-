
public class Test_Referencia {
	public static void main(String[] args) {

		Cliente daniel = new Cliente();

		daniel.setNombre("Daniel Alexis");
		daniel.setDocumento("1035865589");
		daniel.setTelefono("3006276182");

		Cuenta Cuentadaniel = new Cuenta();
		
		Cuentadaniel.setTitular(daniel); 

		System.out.println(Cuentadaniel.getTitular().getNombre());

		Cliente adriana = new Cliente();

		adriana.setNombre("Adriana Restrepo");
		adriana.setDocumento("1152446019"); 
		adriana.setTelefono("3017271060");
		

		Cuenta cuentaadriana = new Cuenta();
		
		cuentaadriana.setTitular(adriana);
		cuentaadriana.depositar(1000);
		
		System.out.println(cuentaadriana.Getsaldo());

	}
}
