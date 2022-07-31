package ejerciciosTema3;

public class principal {

  public static void main(String[] args) {

    int resultado = sumar(1,2,3);
    System.out.println(resultado);

    Coche miCoche = new Coche();
    miCoche.addPuerta(1);
    System.out.println(miCoche.getCantidadPuertas());

  }

  public static int sumar(int a, int b, int c){
    return a + b + c;
  }

}
