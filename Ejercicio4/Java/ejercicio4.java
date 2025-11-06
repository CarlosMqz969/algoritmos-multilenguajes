package Ejercicio4.Java;

public class ejercicio4 {

    public static void main(String[] args) {
        
        int num1 = 14;
        int num2 = 8;
        int numtemp = 0;

        System.out.println("El valor del primer número es: " + num1);
        System.out.println("El valor del segundo número es: " + num2);

        numtemp = num1;
        num1 = num2;
        num2 = numtemp;

        System.out.println("Una vez realizado el cambio los valores quedarian:");
        System.out.println("El valor del primer número es: " + num1);
        System.out.println("El valor del segundo número es: " + num2);
    }
    
}
