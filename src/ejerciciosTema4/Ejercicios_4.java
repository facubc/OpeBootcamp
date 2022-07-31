package ejerciciosTema4;

public class Ejercicios_4 {

  public static void main(String[] args) {
    int numeroIf = 5;

    if (numeroIf > 0){
      System.out.println("numero positivo");
    }else if (numeroIf < 0){
      System.out.println("numero negativo");
    }else{
      System.out.println("es igual a 0");
    }

    int numeroWhile = 0;

    while (numeroWhile < 3){
      numeroWhile ++;
      System.out.println(numeroWhile);
    }

    int numeroDoWhile = 2;

    do {
      numeroDoWhile ++;
      System.out.println(numeroDoWhile);
    }while (numeroDoWhile < 3);

    for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
      System.out.println(numeroFor);
    }

    String estacion = "VERANO";

    switch (estacion){

      case "VERANO":
        System.out.println("es verano");
        break;
      case "OTOÑO":
        System.out.println("es otoño");
        break;
      case "INVIERNO":
        System.out.println("es invierno");
        break;
      case "PRIMAVERA":
        System.out.println("es primavera");
        break;
      default:
        System.out.println("no es una estacion");
    }

  }
}
