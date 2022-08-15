package ejercicioTema8;

public class Ejercicio_8 {

  public static void main(String[] args) {

    Persona persona = new Persona();

    persona.setNombre("Facundo");
    persona.setEdad(33);
    persona.setTelefono("1651651651");

    System.out.println("Nombre: " + persona.getNombre());
    System.out.println("Edad: " + persona.getEdad());
    System.out.println("Telefono: " + persona.getTelefono());

  }

}
