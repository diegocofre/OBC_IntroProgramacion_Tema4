public class Main {
    public static void main(String[] args) {
        System.out.println("* If");

        int numeroIf = -10;

        if (numeroIf > 0) {
            System.out.println(numeroIf + " es positivo");
        } else if (numeroIf < 0) {
            System.out.println(numeroIf + " es negativo");
        } else {
            System.out.println(numeroIf + " es cero");
        }

        System.out.println("* Bucle Whle");
        var numeroWhile = 0;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        System.out.println("* Bucle Do while");
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        } while (numeroWhile < 3);

        System.out.println("* Bucle For");
        for (var i = 0; i <= 3; i++) {
            System.out.println(i);
        }

        System.out.println("* Switch");
        String estacion = "PRIMAVERA";
        switch (estacion.trim().toLowerCase()){
            case "verano":
                System.out.println("Que alegría, es verano!");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "primavera":
                System.out.println("Es primavera, ya viene el verano!");
                break;
            default:
                System.out.println(estacion + " no es una estación!");
        }

    }
}