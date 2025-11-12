public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int a = 10;
        int b = 5;

        int suma = calc.sumar(a, b);
        int resta = calc.restar(a, b);

        System.out.println("Suma de " + a + " + " + b + " = " + suma);
        System.out.println("Resta de " + a + " - " + b + " = " + resta);

    }
}