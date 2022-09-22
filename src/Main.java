public class Main {
    public static void main(String[] args) {

        //       Parte 1 - If
        int numeroIf = 10;

        if (numeroIf == 0){
            System.out.println("El numero es " + numeroIf);
        } else if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }

//        Parte 2 - While
        System.out.println("--------");
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

//        Parte 3 - Do-While
        System.out.println("--------");

        numeroWhile = 3;
        do{
            System.out.println(numeroWhile);
            numeroWhile++;
        }while (numeroWhile < 3);

//        Parte 4 - For
        System.out.println("--------");

        int numeroFor = 0;
        for(int i = 0; i <= 3; i++){
            System.out.println(i);
        }

//        Parte 4- Switch
        System.out.println("--------");

        String estacion = "primavera";

        switch (estacion){
            case "primavera":
                System.out.println("La estacion es " + estacion);
                break;

            case "verano":
                System.out.println("La estacion es " + estacion);
                break;

            case "otoño":
                System.out.println("La estacion es " + estacion);
                break;

            case "invierno":
                System.out.println("La estacion es " + estacion);
                break;

            default:
                System.out.println("La estacion no existe ");
                break;
        }

    }
}