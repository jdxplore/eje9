public class ClaculadoraTest {
    public static void main(String[] args) {
        Calculadora calc  = new Claculadora();

        assert calc.sumar(2, 3) == 5 : "Error en sumar()";
        assert calc.restar(5, 2) == 3 : "Error en restar()";

        System.out.println("Todos los tests pasaron correctamente.");
    }
}