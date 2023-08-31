import java.util.Scanner;
public class MasaCorporal {
    int peso =0;
    float estatura=0;

    float imc;

    public void capturarDatos (Scanner scanner){
        System.out.println("Peso: ");
        peso = scanner.nextInt();
        System.out.println("Estatura en metros: ");
        estatura = scanner.nextFloat();
        procesarIndiceMasa();
    }

    private void procesarIndiceMasa() {
        imc = peso / (estatura * estatura);
        System.out.println("Tu IMC es: " + imc + " asi que tienes");
        int opcion = 1;
        switch (opcion) {
            case 1:
                if (imc < 16) {
                    System.out.println("Delgadez severa: ");
                    break;
                } else opcion++;
            case 2:
                if (((imc == 16) || (imc == 17))) {
                    System.out.println("Delgadez moderada: ");
                    break;
                } else opcion++;
            case 3:
                if (((imc > 17) && (imc < 18.5))) {
                    System.out.println("Delgadez leve: ");
                    break;
                } else opcion++;
            case 4:
                if (((imc > 18.5) && (imc < 25))) {
                    System.out.println("peso normal: ");
                    break;
                } else opcion++;
            case 5:
                if (((imc > 25) && (imc < 30))) {
                    System.out.println("Sobrepeso: ");
                    break;
                } else opcion++;
            case 6:
                if (((imc > 30) && (imc < 35))) {
                    System.out.println("Obecidad leve: ");
                    break;
                } else opcion++;
            case 7:
                if (((imc > 35) && (imc < 40))) {
                    System.out.println("Obecidad moderada: ");
                    break;
                } else opcion++;
            case 8:
                if (imc >= 40) {
                    System.out.println("Obecidad morbida: ");
                    break;
                }
        }

    }
}
