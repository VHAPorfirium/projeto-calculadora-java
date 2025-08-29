public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.somar(5, 3);
        System.out.println("O resultado da soma é: " + resultado);

        int resultado2 = calculadora.subtrair(6,3);
        System.out.println("Resultado da subtração é: " + resultado2);

        int resultado3 = calculadora.multiplicacao(8,3);
        System.out.println("Resultado da multiplicação é: " + resultado3);
    }
}
