package ejercicioTema9;

public class Ejercicio_9 {

  public static void main(String[] args) {

    Cliente cliente = new Cliente();
    cliente.setNombre("Ezequiel");
    cliente.setEdad(33);
    cliente.setTelefono("6541651651");
    cliente.setCredito(100);

    System.out.println(cliente.getNombre());
    System.out.println(cliente.getEdad());
    System.out.println(cliente.getTelefono());
    System.out.println(cliente.getCredito());


    Trabajador trabajador = new Trabajador();
    trabajador.setNombre("Homero");
    trabajador.setEdad(53);
    trabajador.setTelefono("2256511155");
    trabajador.setSalario(80000);

    System.out.println(trabajador.getNombre());
    System.out.println(trabajador.getEdad());
    System.out.println(trabajador.getTelefono());
    System.out.println(trabajador.getSalario());



  }

}
