public class ejercicio2 {
    public static void main (String[]args) {
        double peso = 74;
        double altura = 1.69;
        double imc = 0;

        imc = peso / (altura * altura);

        System.out.println("El indice de masa corporal de esta persona que mide: " + altura + " metros y pesa: " + peso + " kilogramos es igual a: " + imc);



    }
}